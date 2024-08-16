public class AllAboutStrings {
    public static void main(String[] args) {
        printInformation("Hello, World!");
        printInformation("");
        printInformation("\t   \n ");
        printInformation("Hello, World!  ");

        String helloWorld = "Hello, World!";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));
        System.out.printf("index of r starting from index 8 = %d %n", helloWorld.indexOf('r', 8));
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("last index of l = %d %n", helloWorld.lastIndexOf('l'));

        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)) {
            System.out.println("The strings are equal.");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("The strings are equal ignoring case");
        }
        if(helloWorld.startsWith("Hello")) {
            System.out.println("The string starts with Hello");
        }
        if(helloWorld.endsWith("World")) {
            System.out.println("The string ends with world");
        }
        if(helloWorld.contains("World")) {
            System.out.println("The string contains world");
        }
        if(helloWorld.contentEquals("Hello World")) {
            System.out.println("Values Match exactly");
        }
    }

    public static void printInformation(String string) {
        if(string.isEmpty()) {
            System.out.println("The String is empty");
            return;
        } else if(string.isBlank()) {
            System.out.println("The String is blank");
            return;
        }
        int length = string.length();
        System.out.printf("The string is %d characters long.\n", length);
        System.out.printf("The first character is %c.\n", string.charAt(0));
        System.out.printf("The last character is %c.\n", string.charAt(length - 1));

        System.out.printf("The first 5 characters are \"%s\".\n", string.substring(0, 5));
        System.out.printf("The last 5 characters are \"%s\".\n", string.substring(length - 5));

        System.out.printf("The string in uppercase is \"%s\".\n", string.toUpperCase());
        System.out.printf("The string in lowercase is \"%s\".\n", string.toLowerCase());

        System.out.printf("The string with all spaces removed is \"%s\".\n", string.replace(" ", ""));
        System.out.printf("The string with all commas removed is \"%s\".\n", string.replace(",", ""));

        System.out.printf("The string with all leading and trailing spaces removed is \"%s\".\n", string.strip());


    }
}
