public class WhileChallenge {
    public static void main(String[] args) {
        printEvenNumbers();
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void printEvenNumbers () {
        int count = 5;
        int evenCount = 0;
        int oddCount = 0;

        while(count <= 20 && evenCount <= 5) {
            if(isEvenNumber(count)) {
                System.out.println(count + " Is a even number");
                evenCount++;
            }
            count++;
            oddCount++;

        }
        System.out.println("Total even numbers = " + evenCount);
        // System.out.println("Total odd numbers = " + oddCount);
    }
}
