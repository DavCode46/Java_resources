package dev.davcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "oranges"};
        System.out.println(Arrays.toString(items));
        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("milk");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("milk", "eggs", "bread"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));
        if(groceries.contains("milk")) {
            System.out.println("Milk is in the list");
        }
        groceries.add("milk");
        System.out.println("first = " + groceries.indexOf("milk"));
        System.out.println("last = " + groceries.lastIndexOf("milk"));

        System.out.println(groceries);
        groceries.remove("milk");
        System.out.println(groceries);
        groceries.remove(2);
        System.out.println(groceries);
        groceries.removeAll((List.of("milk", "eggs")));
        System.out.println(groceries);

        groceries.retainAll(List.of("bread"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("Is the list empty? " + groceries.isEmpty());

        groceries.addAll(List.of("milk", "eggs", "bread"));
        groceries.addAll(Arrays.asList("apples", "bananas", "oranges"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
