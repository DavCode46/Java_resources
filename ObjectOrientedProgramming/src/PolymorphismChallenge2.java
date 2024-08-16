public class PolymorphismChallenge2 {
    public static void main(String[] args) {

    }
}

class Car {
    // Private member variables
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructor
    public Car(int cylinders, String name) {
        this.engine = true; // Default value
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4; // Default value
    }

    // Method to start the engine
    public String startEngine() {
        return "Car -> startEngine()";
    }

    // Method to accelerate
    public String accelerate() {
        return "Car -> accelerate()";
    }

    // Method to brake
    public String brake() {
        return "Car -> brake()";
    }

    // Getter for cylinders
    public int getCylinders() {
        return cylinders;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {
    // Constructor
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Ford extends Car {
    // Constructor
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Holden extends Car {
    // Constructor
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}
