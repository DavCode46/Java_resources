public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits of 125 is " + sumDigits(125));
        System.out.println("The sum of the digits of 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits of 1000 is " + sumDigits(1000));
        System.out.println("The sum of the digits of 4 is " + sumDigits(4));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if(number <= 0) {
            return -1;
        }
        while(number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
