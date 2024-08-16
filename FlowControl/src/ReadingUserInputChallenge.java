import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

//        while(counter <= 5) {
//            System.out.println("Enter number #" + counter + ":");
//            boolean hasNextInt = scanner.hasNextInt();
//
//            if(hasNextInt) {
//                int number = scanner.nextInt();
//                sum += number;
//                counter++;
//            } else {
//                System.out.println("Invalid Number");
//            }
//            scanner.nextLine();
//        }

        while(counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                sum += number;
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("Sum of the numbers is: " + sum);
    }
}
