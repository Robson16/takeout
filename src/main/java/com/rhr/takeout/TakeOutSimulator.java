package com.rhr.takeout;

import java.util.Scanner;

public class TakeOutSimulator {
    private final Customer customer;
    private final FoodMenu menu;
    private final Scanner input;

    public TakeOutSimulator(Customer customer,FoodMenu menu, Scanner input) {
        this.customer = customer;
        this.menu = menu;
        this.input = input;
    }

    private <T> T getOutputOnIntInput(String userInputPrompt, IntUserInputRetriever<T> intUserInputRetriever) {
        while (true) {
            try {
                System.out.println(userInputPrompt);

                if (input.hasNextInt()) {
                    int userInput = input.nextInt();
                    input.nextLine();
                    return intUserInputRetriever.produceOutputOnIntUserInput(userInput);
                } else {
                    System.out.println("Input needs to be an `int` type. Try again!");
                    input.nextLine();
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean shouldSimulate() {
        String userPrompt = "Enter 1 to CONTINUE simulation or 0 to EXIT program: ";

        IntUserInputRetriever<Boolean> retriever = new IntUserInputRetriever<Boolean>() {
            @Override
            public Boolean produceOutputOnIntUserInput(int selection) throws IllegalArgumentException {
                if (selection == 1) {
                    if (customer.getMoney() >= menu.getLowestCostFood().getPrice()) {
                        return true;
                    } else {
                        System.out.println("You don't have enough money to continue shopping :( - ending simulation...");
                        return false;
                    }
                } else if (selection == 0) {
                    return false;
                } else {
                    throw new IllegalArgumentException("Invalid selection. Please enter 1 to continue or 0 to exit.");
                }
            }
        };

        return getOutputOnIntInput(userPrompt, retriever);
    }

    public Food getMenuSelection() {
        System.out.println(this.menu.toString());
        String userPrompt = "Choose a menu item: ";

        IntUserInputRetriever<Food> retriever = new IntUserInputRetriever<Food>() {
            @Override
            public Food produceOutputOnIntUserInput(int selection) throws IllegalArgumentException {
                Food selectedFood = menu.getMenu(selection);

                if (selectedFood == null) {
                    throw new IllegalArgumentException("Food item is not available. Try again.");
                }
                return selectedFood;
            }
        };

        return getOutputOnIntInput(userPrompt, retriever);
    }

    public boolean isStillOrderingFood() {
        String userPrompt = "Enter 1 to CONTINUE shopping or 0 to CHECKOUT: ";

        IntUserInputRetriever<Boolean> retriever = new IntUserInputRetriever<Boolean>() {
            @Override
            public Boolean produceOutputOnIntUserInput(int selection) throws IllegalArgumentException {
                if (selection == 1) {
                    return true;
                } else if (selection == 0) {
                    return false;
                } else {
                    throw new IllegalArgumentException("Invalid selection. Please enter 1 to CONTINUE shopping or 0 to CHECKOUT.");
                }
            }
        };

        return getOutputOnIntInput(userPrompt, retriever);
    }

    public void checkoutCustomer(ShoppingBag<Food> shoppingBag) {
        System.out.println("Processing payment...");

        int totalCost = shoppingBag.getTotalPrice();
        int remainingMoney = customer.getMoney() - totalCost;

        customer.setMoney(remainingMoney);

        System.out.println("Your remaining money: $" + remainingMoney);
        System.out.println("Thank you and enjoy your food!");
    }

    public void takeOutPrompt() {
        ShoppingBag<Food> shoppingBag = new ShoppingBag<>();
        int customerMoneyLeft = customer.getMoney();

        while (true) {
            System.out.println("You have $" + customerMoneyLeft + " left to spend");

            Food selectedFood = getMenuSelection();

            if (selectedFood.getPrice() <= customerMoneyLeft) {
                shoppingBag.addItem(selectedFood);
                customerMoneyLeft -= selectedFood.getPrice();
                System.out.println("Added " + selectedFood.getName() + " to your bag.");

            } else {
                System.out.println("Oops! Looks like you don't have enough for that. Choose another item or checkout.");
            }

            if (!isStillOrderingFood()) {
                break;
            }
        }

        checkoutCustomer(shoppingBag);
    }

    public void startTakeOutSimulator() {
        System.out.println("Hello, welcome to my restaurant!");

        while (true) {
            System.out.println("Welcome " + customer.getName() + "!");

            takeOutPrompt();

            if (!shouldSimulate()) {
                System.out.println("Thank you for visiting! See you next time!");
                break;
            }
        }
    }
}
