public class PolymorphismChallenge {
    public static void main(String[] args) {
        Car2 car = new Car2("Generic car");
        runRace(car);

        Car2 gasCar = new GasPowerCar("Gas powered car", 10.0, 4);
        runRace(gasCar);

        Car2 electricCar = new ElectricCar("Electric car", 100.0, 100);
        runRace(electricCar);

        Car2 hybridCar = new HybridCar("Hybrid car", 20.0, 50, 4);
        runRace(hybridCar);
    }

    public static void runRace(Car2 car) {
        car.startEngine();
        car.drive();
    }

}

class Car2 {
    private String description;

    public Car2(String description) {
        this.description = description;
    }

    public void drive() {
        System.out.println("Driving a car " + getClass().getSimpleName());
        runEngine();
    }

    public void startEngine() {
        System.out.println("Starting the engine");
    }

    protected void runEngine() {
        System.out.println("Running the engine");
    }
}

class GasPowerCar extends Car2{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPowerCar(String description) {
        super(description);
    }

    public GasPowerCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> %d cylinders are fired up%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> %.2f km per litre%n", avgKmPerLitre);
    }

    @Override
    public void drive() {
        System.out.println("Driving a gas powered car");
        runEngine();
    }
}

class ElectricCar extends Car2{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric -> Starting the engine");
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric -> %.2f km per charge%n", avgKmPerCharge);
    }

    @Override
    public void drive() {
        System.out.println("Driving an electric car");
        runEngine();
    }

}

class HybridCar extends Car2{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up%n", cylinders);
        System.out.printf("Hybrid -> %d battery size%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLitre);
    }

    @Override
    public void drive() {
        System.out.println("Driving a hybrid car");
        runEngine();
    }
}
