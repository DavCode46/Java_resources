public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(6));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(6));
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('o', 5));
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("World", 7));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World!"));
        System.out.println(str.contains("Hello"));
        System.out.println(str.contains("World"));
        System.out.println(str.equals("Hello World!"));
        System.out.println(str.equalsIgnoreCase("hello world!"));
        System.out.println(str.replace('o', 'x'));
        System.out.println(str.replace("World", "Java"));
        System.out.println(str.replaceAll("World", "Java"));
        System.out.println(str.replaceFirst("World", "Java"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());

        String newDate = String.join("/", "25", "06", "2021");
        System.out.println(newDate);
        newDate = "25";
        newDate = newDate.concat("/06").concat("/2021");
        System.out.println(newDate);

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
