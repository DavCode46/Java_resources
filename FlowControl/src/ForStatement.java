public class ForStatement {
    public static void main(String[] args) {
        for(double i = 7.5; i <= 10.00; i += 0.25) {
            System.out.println("100 at " + i + " % interest = " + String.format("%.2f", calculateInterest(100.00, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
