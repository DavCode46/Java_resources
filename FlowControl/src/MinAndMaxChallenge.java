public class MinAndMaxChallenge {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while(true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min: " + min + ", Max: " + max);
        scanner.close();
    }
}
