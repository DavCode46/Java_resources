package dev.davcode;

public class Varargs {
    public static void main(String... args) {
        System.out.println("Hello world again");
        System.out.println("-".repeat(30));

        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);

        System.out.println("-".repeat(30));
        printText("Hello", "world", "again");

        System.out.println("-".repeat(30));
        printText("Hello");
        System.out.println("-".repeat(30));

        String[] array = {"first", "second", "third"};
        System.out.println(String.join(",", array));
    }

    private static void printText(String... textList) {
        for (String text : textList) {
            System.out.println(text);
        }
    }
}
