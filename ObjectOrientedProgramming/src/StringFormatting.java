public class StringFormatting {

    public static void main(String[] args) {
        String bulletIt = "Print this in bullet points" +
                "\n \t • First bullet point" +
                "\n \t \t • Second bullet point";
        System.out.println(bulletIt);

        String textBlock = """
                This is a text block
                    • First bullet point
                        • Second bullet point
                """;
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("I am %d years old%n", age);

        int yearOfBirth = 1986;
        System.out.printf("Age = %d, Birth Year = %d%n", age, yearOfBirth);

        for(int i = 1; i <= 100_000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Age = %d, Birth Year = %d%n", age, yearOfBirth);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
