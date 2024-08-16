package dev.davcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {

        processArrayList();
    }

    private static void printInstructions() {
        System.out.println("0 - to shutdown\n" +
                "1 - to add item(s) to list (comma delimited list)\n" +
                "2 - to remove any items (comma delimited list)\n" +
                "Enter a number for which action you want to do:");
    }

    private static void addItem(ArrayList<String> groceries, Scanner s) {
        System.out.println("Enter the item(s) you want to add:");
        String[] items = s.nextLine().split(",");
        for(String i : items) {
            String trimmed = i.trim();
            if(!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItem(ArrayList<String> groceries, Scanner s) {
        System.out.println("Enter the item(s) you want to remove:");
        String[] items = s.nextLine().split(",");
        for(String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printItems(ArrayList<String> groceries) {
        System.out.println("Printing items...");
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }

    private static void shutdown() {
        System.out.println("Shutting down...");
    }

    private static void processArrayList() {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        ArrayList<String> groceries = new ArrayList<>();
        while(!quit) {
            printInstructions();
            int action = s.nextInt();
            s.nextLine();
            switch(action) {
                case 0 -> {
                    shutdown();
                    quit = true;
                }
                case 1 -> {
                    addItem(groceries, s);
                    printItems(groceries);
                }
                case 2 -> {
                    removeItem(groceries, s);
                    printItems(groceries);
                }
                default -> printInstructions();
            }
        }
    }
}
