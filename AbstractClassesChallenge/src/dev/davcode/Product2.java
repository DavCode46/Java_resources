package dev.davcode;

public class Product2 extends ProductForSale {
    private String brand;
    private String model;

    public Product2(String type, double price, String description, String brand, String model) {
        super(type, price, description);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void showDetails() {
        System.out.printf("Product: %-15s %-35s Brand: %-15s Model: %-15s %n", type, description, brand, model);
    }
}
