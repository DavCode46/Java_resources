package dev.davcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysAndArrayLists {
    public static void main(String[] args) {

        String[] originalArray = new String[] {"one", "two", "three", "four", "five"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "1");
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        originalList.sort((Comparator.naturalOrder()));
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }
}
