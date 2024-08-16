package dev.davcode;

import java.util.Arrays;

public class ArrayReverseChallenge {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("-".repeat(30));
        int[] reversedArray = reverseCopy(array);
        System.out.println("ReversedArray: " + Arrays.toString(reversedArray));
    }

    private static int[] reverse(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[maxIndex - i];
            reversedArray[maxIndex - i] = temp;
            System.out.println("------->" + Arrays.toString(reversedArray));
        }
        return reversedArray;
    }

    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for(int el : array) {
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
}
