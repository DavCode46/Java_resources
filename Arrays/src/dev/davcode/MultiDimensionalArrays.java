package dev.davcode;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length: " + array2.length);

        for(int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
            System.out.println("-".repeat(30));
        }

        for(int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];

            for(int j = 0; j < innerArray.length; j++) {
//                System.out.println("array2[" + i + "][" + j + "]: " + array2[i][j]);
                array2[i][j] = (i * 10) + (j + 1);
            }
//            System.out.println("-".repeat(30));
        }
//        for(var outer : array2) {
//            for(var element : outer) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(array2));

        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));

        Object[] objArray = new Object[3];
        System.out.println(Arrays.toString(objArray));

        objArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(objArray));

        objArray[1] = new String[][] {
            {"a", "b"},
            {"d", "e", "f"},
            {"g", "h", "i", "j"}
        };
        System.out.println(Arrays.deepToString(objArray));

        objArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(objArray));

        for(Object element : objArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
