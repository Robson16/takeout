package com.rhr.takeout;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the TakeOut Simulator!");
        System.out.print("Please enter your name: ");
        String customerName = input.nextLine();

        int money = 0;

        while (true) {
            try {
                System.out.print("Enter the amount of money you have to spend: ");

                money = Integer.parseInt(input.nextLine());
                if (money <= 0) {
                    System.out.println("Please enter a positive amount.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        Customer customer = new Customer(customerName, money);
        FoodMenu menu = new FoodMenu();

        // Instancia o simulador de pedidos
        TakeOutSimulator takeOutSimulator = new TakeOutSimulator(customer,menu, input);

        // Inicia a simulação
        takeOutSimulator.startTakeOutSimulator();

        // Fecha o scanner
        input.close();
    }
}
