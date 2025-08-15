package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return Colour.RED.equals(colour) ? Discount.RED_APPLE_DISCOUNT : 0;
    }

    public String getColour() {
        return colour;
    }
}