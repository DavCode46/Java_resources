public class PrimeNumberChallenge {
    public static void main(String[] args) {
        printPrimeNumbers();
    }

    public static boolean isPrime(int wholeNumber) {
        if(wholeNumber <= 1) {
            return false;
        }
        for(int i = 2; i <= wholeNumber / 2; i++) {
            if(wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers() {
        int count = 0;
        for(int i = 2; i <= 1000; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            }
            if(count == 3) {
                break;
            }
        }
        System.out.println("There are " + count + " prime numbers between 0 and 1000");
    }
}
