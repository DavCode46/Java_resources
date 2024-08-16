public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome(int number) {
        if(number < 0) {
            number = -number;
        }
        int reverse = 0;
        int originalNumber = number;
        while(number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return reverse == originalNumber;
    }
}
