package dev.davcode;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = getIntegers(5);
        printArray(arr);
        System.out.println("Sorted Array: ");
        int[] sortedArray = sortIntegers(arr);
        printArray(sortedArray);
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static int[] getIntegers(int len) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            arr[i] = s.nextInt();
        }
        return arr;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }
}
