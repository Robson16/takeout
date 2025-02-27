package com.rhr.takeout;

public class Food implements PricedItem<Integer> {
    private String name;
    private String description;
    private Integer price;

    public Food(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Enjoy " + this.name + ": " + this.description + "   Cost: $" + this.price;
    }
}
