package main;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        Food[] products = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Общая сумма без скидки: %.2f руб.%n", cart.getTotalCostWithoutDiscount());
        System.out.printf("Общая сумма со скидкой: %.2f руб.%n", cart.getTotalCostWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f руб.%n", cart.getVegetarianProductsCost());
    }
}