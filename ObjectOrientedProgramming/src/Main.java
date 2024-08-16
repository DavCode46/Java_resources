//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.setMake("Porsche");
//        myCar.setModel("Mustang");
//        myCar.setColor("Red");
//        myCar.setDoors(2);
//        myCar.setConvertible(true);
//
//        myCar.describeCar();

        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        account.setBalance(1000);
        account.setCustomerName("John Doe");
        account.setEmail("John@gmail.com");
        account.setPhoneNumber("1234567890");
        System.out.println( account.toString());
        account.depositFunds(500);
        System.out.println(account.toString());
        account.withdrawFunds(2000);
        System.out.println(account.toString());
        account.withdrawFunds(1000);
        System.out.println(account.toString());
    }
}