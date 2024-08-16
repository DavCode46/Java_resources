package dev.davcode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (arr.length - 1) * i;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();

        String arrayString = Arrays.toString(arr);
        System.out.println(arrayString);
        Object obj = arr;
        if(obj instanceof int[]) {
            System.out.println("obj is an int[]");
        }

        Object[] objArr = new Object[4];
        objArr[0] = "Hello";
        objArr[1] = new StringBuilder("World");
        objArr[2] = 42;
        objArr[3] = arr;
        System.out.println(Arrays.toString(objArr));

    }
}
