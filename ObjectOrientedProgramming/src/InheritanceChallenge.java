public class InheritanceChallenge {
    public static void main(String[] args) {

        Worker worker = new Worker("John Doe", "1990-01-01");
        System.out.println(worker.getAge());
        System.out.println(worker.collectPay());
        worker.terminate("2024-01-01");
        System.out.println(worker.endDate);

        Employee employee = new Employee("Jane Doe", "1995-01-01", "2020-01-01");
        System.out.println(employee);

        SalariedEmployee salariedEmployee = new SalariedEmployee("Jack Doe", "1990-01-01", "2020-01-01", 100000.0);
        System.out.println(salariedEmployee.collectPay());
        salariedEmployee.retire();
        System.out.println(salariedEmployee.collectPay());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jill Doe", "1995-01-01", "2020-01-01", 50.0);
        System.out.println(hourlyEmployee.collectPay());
        System.out.println(hourlyEmployee.getDoublePay());

    }
}

class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }
}

class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 12;
        double adjustedPaycheck = isRetired ? paycheck * 0.9 : paycheck;
        return (int) adjustedPaycheck;
    }

    public void retire() {
        terminate("2024-01-01");
        isRetired = true;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
