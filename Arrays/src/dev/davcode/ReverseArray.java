package dev.davcode;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    private static void reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        int maxIndex = array.length - 1;
        System.out.println("Array = " + Arrays.toString(array));
        for(int el : array) {
            reverseArray[maxIndex--] = el;
        }
        System.out.println("Reversed array = " + Arrays.toString(reverseArray));
    }
}
