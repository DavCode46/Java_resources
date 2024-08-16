package dev.davcode;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {

    }

    public static int readInteger() {
        Scanner s = new Scanner(System.in);
        int numberOfElements;
        System.out.println("Enter the number of elements: ");
        numberOfElements = s.nextInt();
        return numberOfElements;
    }

    public static int[] readElements(int numberOfElements) {
        Scanner s = new Scanner(System.in);
        int[] elements = new int[numberOfElements];
        for(int i = 0; i < elements.length; i++) {
            System.out.printf("Enter element %d: ", i);
            elements[i] = s.nextInt();
        }
        return elements;
    }

    public static int findMin(int[] elements) {
        int min = Integer.MAX_VALUE;
        for(int value : elements) {
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
