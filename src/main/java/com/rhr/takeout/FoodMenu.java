package com.rhr.takeout;

import java.util.ArrayList;
import java.util.List;

public class FoodMenu {
    private final List<Food> menu;

    public FoodMenu() {
        this.menu = new ArrayList<>();

        Food pizza = new Food("Pizza", "Delicious pepperoni pizza.", 20);
        Food hotDog = new Food("Brazilian Hot-Dog", "A very big hot-dog.", 8);
        Food apple = new Food("Apple", "Just a simple apple.", 1);

        this.menu.add(pizza);
        this.menu.add(hotDog);
        this.menu.add(apple);
    }

    public Food getMenu(int index) {
        if (index < 1 || index > this.menu.size()) {
            return null;
        }

        return this.menu.get(index - 1);
    }

    public Food getLowestCostFood() {
        if (this.menu.isEmpty()) {
            return null;
        }

        Food lowestCostFood = this.menu.get(0);

        for (Food food : this.menu) {
            if (food.getPrice() < lowestCostFood.getPrice()) {
                lowestCostFood = food;
            }
        }

        return lowestCostFood;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < menu.size(); i++) {
            Food food = menu.get(i);
            sb.append(i + 1).append(". ") // Número identificador
                    .append(food.getName()).append(": ") // Nome do item
                    .append(food.getDescription()).append("    ") // Descrição
                    .append("Cost: $").append(food.getPrice()).append("\n"); // Preço
        }

        return sb.toString();
    }
}
