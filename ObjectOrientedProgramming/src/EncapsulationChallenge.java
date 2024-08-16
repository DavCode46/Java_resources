public class EncapsulationChallenge {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}

class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // Constructor
    public Printer(int tonerLevel, boolean duplex) {
        // Ensure toner level is between 0 and 100
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    // Method to add toner
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount + tonerLevel <= 100) {
            tonerLevel += tonerAmount;
            return tonerLevel;
        } else {
            // Return -1 if toner level is out of range
            return -1;
        }
    }

    // Method to print pages
    public int printPages(int pages) {
        int jobPages;
        // Handle duplex printing
        if (duplex) {
            jobPages = (pages + 1) / 2; // Rounded up for duplex printing
        } else {
            jobPages = pages;
        }
        pagesPrinted += jobPages;
        return jobPages;
    }

    // Getter for pages printed
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
