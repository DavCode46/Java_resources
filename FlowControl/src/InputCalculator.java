public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0;
        while(true) {
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        if(count > 0) {
            average = Math.round((double) sum / count);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}

