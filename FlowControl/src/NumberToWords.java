public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(0);
    }
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);
        while(reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;
            switch(lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10;
        }
        if(originalDigitCount != reversedDigitCount) {
            for(int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
                System.out.println("Zero");
            }
        }

    }
    public static int reverse(int number) {
        int reversedNumber = 0;
        while(number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }
    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int count = 0;
        while(number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
