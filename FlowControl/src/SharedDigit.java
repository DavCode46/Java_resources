public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 9));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        int firstDigit1 = number1 / 10;
        int secondDigit1 = number1 % 10;
        int firstDigit2 = number2 / 10;
        int secondDigit2 = number2 % 10;
        return (firstDigit1 == firstDigit2 || firstDigit1 == secondDigit2 || secondDigit1 == firstDigit2 || secondDigit1 == secondDigit2);
    }
}
