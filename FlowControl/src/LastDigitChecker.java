public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }


        public static boolean hasSameLastDigit(int number1, int number2, int number3) {
            // Check if all numbers are within the valid range
            if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
                return false;
            }

            // Extract the last digits of each number
            int lastDigit1 = number1 % 10;
            int lastDigit2 = number2 % 10;
            int lastDigit3 = number3 % 10;

            // Check if at least two of the numbers share the same last digit
            return (lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3);
        }

        public static boolean isValid(int number) {
            // Check if the number is within the range 10 to 1000 inclusive
            return number >= 10 && number <= 1000;
        }


}
