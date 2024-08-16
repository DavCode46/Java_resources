public class StringBuilderMethods {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World!";
        helloWorld.concat(" and goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World!");
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        helloWorldBuilder.delete(0, 5);
        printInformation(helloWorldBuilder);

        helloWorldBuilder.deleteCharAt(0);
        printInformation(helloWorldBuilder);

        helloWorldBuilder.insert(0, "Hello");
        printInformation(helloWorldBuilder);

        helloWorldBuilder.reverse();
        printInformation(helloWorldBuilder);

        helloWorldBuilder.setLength(5);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        emptyStart.append("a".repeat(57));
        emptyStart32.append("a".repeat(17));



        printInformation(emptyStart);
        printInformation(emptyStart32);
    }

    public static void printInformation(String string) {
        System.out.println("String: " + string);
        System.out.println("Length: " + string.length());
    }
    public static void printInformation(StringBuilder stringBuilder) {
        System.out.println("StringBuilder: " + stringBuilder);
        System.out.println("Length: " + stringBuilder.length());
        System.out.println("Capacity: " + stringBuilder.capacity());
    }

}
