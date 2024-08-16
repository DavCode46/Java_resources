package dev.davcode;

import java.util.Arrays;

public class ArrayReferences {
    public static void main(String[] args) {

        int[] array = new int[5];
        int[] anotherArray = array;
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
        System.out.println("-".repeat(30));

        array[0] = 10;
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
        System.out.println("-".repeat(30));

        anotherArray[0] = 20;
        modifyArray(array);
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }
}
