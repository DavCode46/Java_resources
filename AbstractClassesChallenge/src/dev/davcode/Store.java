package dev.davcode;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> products = new ArrayList<>();



    public static void main(String[] args) {
        products.add(new Product1("Laptop", 1000.0, "A laptop for programming", "Dell", "Inspiron 15"));
        products.add(new Product2("Laptop", 1500.0, "A laptop for gaming", "Asus", "ROG Strix"));
        products.add(new Product3("Laptop", 2000.0, "A laptop for business", "HP", "EliteBook"));

        listProducts();

        System.out.println("\n\nOrder 1");
        ArrayList<OrderItem> order1 = new ArrayList<>();
        addItemToOrder(order1, 0, 2);
        addItemToOrder(order1, 1, 1);
        addItemToOrder(order1, 2, 1);
        printOrder(order1);

        System.out.println("\n\nOrder 2");
        ArrayList<OrderItem> order2 = new ArrayList<>();
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 1, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);

        System.out.println("\n\nOrder 3");
        ArrayList<OrderItem> order3 = new ArrayList<>();
        addItemToOrder(order3, 0, 1);
        addItemToOrder(order3, 1, 1);
        printOrder(order3);
    }

    public static void listProducts() {
        System.out.println("Product List");

        for (ProductForSale product : products) {
            System.out.println("=".repeat(100));
            product.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(products.get(orderIndex), qty));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for(var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Total: $%6.2f %n", salesTotal);
    }
}
