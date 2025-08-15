package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalCostWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalCostWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double itemCost = item.getAmount() * item.getPrice();

            if (item instanceof Discountable) {
                double discount = ((Discountable) item).getDiscount();
                itemCost -= itemCost * discount / 100;
            }

            total += itemCost;
        }
        return total;
    }

    public double getVegetarianProductsCost() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}