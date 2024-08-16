package dev.davcode;

import java.util.Arrays;
import java.util.Random;

public class JavaUtilArrays {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println("First Array: " + Arrays.toString(firstArray));
        System.out.println("-".repeat(50));

        Arrays.sort(firstArray);
        System.out.println("Sorted First Array: " + Arrays.toString(firstArray));
        System.out.println("-".repeat(50));

        int[] secondArray = new int[10];
        System.out.println("Second Array: " + Arrays.toString(secondArray));
        System.out.println("-".repeat(50));

        Arrays.fill(secondArray, 5);
        System.out.println("Filled Second Array: " + Arrays.toString(secondArray));
        System.out.println("-".repeat(50));

        int[] thirdArray = getRandomArray(10);
        System.out.println("Third Array: " + Arrays.toString(thirdArray));
        System.out.println("-".repeat(50));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("Fourth Array: " + Arrays.toString(fourthArray));
        System.out.println("-".repeat(50));

        Arrays.sort(fourthArray);
        System.out.println("Third Array: " + Arrays.toString(thirdArray));
        System.out.println("Sorted Fourth Array: " + Arrays.toString(fourthArray));
        System.out.println("-".repeat(50));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println("Smaller Array: " + Arrays.toString(smallerArray));
        System.out.println("-".repeat(50));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println("Larger Array: " + Arrays.toString(largerArray));
        System.out.println("-".repeat(50));

        String [] names = {"David", "John", "Jane", "Doe"};
        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("-".repeat(50));
        Arrays.sort(names);
        System.out.println("Sorted Names: " + Arrays.toString(names));
        System.out.println("-".repeat(50));
        if(Arrays.binarySearch(names, "John") >= 0) {
            System.out.println("John is in the Names array");
        } else {
            System.out.println("John is not in the Names array");
        }
        System.out.println("-".repeat(50));

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};

        if(Arrays.equals(s1, s2)) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }
        System.out.println("-".repeat(50));


    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}
