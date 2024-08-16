package dev.davcode;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge2 {
    public static void main(String[] args) {
        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));
        System.out.println("The minimum number is: " + findMin(array));
    }

    private static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of integers separated by commas:  ");
        String input = s.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for(int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        System.out.print("The array is: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
