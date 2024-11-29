package com.rhr.takeout;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBag<T extends PricedItem<Integer>> {
    private final Map<T, Integer> shoppingBag;

    public ShoppingBag() {
        this.shoppingBag = new HashMap<>();
    }

    public void addItem(T item) {
        if (this.shoppingBag.get(item) == null) {
            this.shoppingBag.put(item, 1);
        } else {
            this.shoppingBag.put(item, this.shoppingBag.get(item) + 1);
        }
    }

    public int getTotalPrice() {
        int grandTotal = 0;

        for (T item : shoppingBag.keySet()) {
            int itemPrice = item.getPrice();
            int quantity = shoppingBag.get(item);
            int totalPriceForItem = itemPrice * quantity;

            grandTotal += totalPriceForItem;
        }

        return grandTotal;
    }
}
