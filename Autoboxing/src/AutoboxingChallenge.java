import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<>(500));
        transactions.add(initialDeposit);
    }
}

public class AutoboxingChallenge {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("National Australia Bank");
        bank.addCustomer("Tim", 50.05);
        bank.addCustomer("Mike", 175.34);
        bank.addCustomer("Percy", 220.12);
        System.out.println(bank);

        bank.addTransaction("Tim", 44.22);
        bank.addTransaction("Tim", -22.22);
        bank.printStatement("Tim");

        bank.addCustomer("Robert", 500);
        bank.addTransaction("Robert", 12.44);
        bank.printStatement("Robert");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(500);

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer %s not found\n", customerName);
        return null;
    }

    public void addCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialDeposit));
            System.out.println("Customer added successfully " + customerName);
        }
    }

    public void addTransaction(String customerName, double transaction) {
        Customer customer = getCustomer(customerName);
        if (customer != null) {
            customer.transactions().add(transaction);
            System.out.println("Transaction added successfully " + transaction);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
       if(customer == null) {
           return;
       }
        System.out.println("-".repeat(50));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transactions: ");
        for (double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n",d, d < 0 ? "debit" : "credit");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
