package dev.davcode;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
    public static void main(String[] args) {
//        int[] numbers = getRandomArray(10);
//        System.out.println("Reversed Array: " + Arrays.toString(reverseArray(numbers)));

        int[] sortedArray = sortIntegers(new int[] {7, 30, 35});
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] numbers = new int[len];
        for(int i = 0; i < len; i++) {
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        System.out.println("Original Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
        for(int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    private static int[] sortIntegers(int[] array) {
        System.out.println("Original Array: " + Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("-------->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-------->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
