package dev.davcode;

public enum Topping {
    CHEESE,
    TOMATO,
    MUSHROOM,
    PEPPERONI,
    PINEAPPLE,
    BACON,
    HAM,
    SAUSAGE,
    OLIVES,
    ONIONS;

    public double getPrice() {

        return switch(this) {
            case CHEESE -> 1.5;
            case TOMATO -> 0.5;
            case MUSHROOM -> 2.5;
            case PEPPERONI -> 1.0;
            case PINEAPPLE -> 1.2;
            case BACON -> 3.5;
            case HAM -> 3.0;
            case SAUSAGE -> 2.0;
            case OLIVES -> 1.75;
            case ONIONS -> 0.3;
        };
    }
}
