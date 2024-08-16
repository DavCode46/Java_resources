public class Composition {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, "1920x1080");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        ComputerCase computerCase = new ComputerCase("220B", "Dell", "240");

        PersonalComputer pc = new PersonalComputer("PC-200", "Dell", monitor, motherboard, computerCase);
//        pc.getMonitor().drawPixelAt(1500, 1200, "red");
//        pc.getMotherboard().loadProgram("Windows 10");
//        pc.getComputerCase().pressPowerButton();
        pc.powerUp();
    }
}

class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }
}

class Motherboard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;
    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading..");
    }
}

class ComputerCase extends Product {

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}

class PersonalComputer extends Product {

        private Monitor monitor;
        private Motherboard motherboard;
        private ComputerCase computerCase;

        public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
            super(model, manufacturer);
            this.monitor = monitor;
            this.motherboard = motherboard;
            this.computerCase = computerCase;
        }

        private void drawLogo() {
            // Fancy graphics
            monitor.drawPixelAt(1200, 50, "yellow");
        }

        public void powerUp() {
            computerCase.pressPowerButton();
            drawLogo();
            motherboard.loadProgram("Windows 10");
        }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }

//    public void powerUp() {
//            computerCase.pressPowerButton();
//            motherboard.loadProgram("Windows 10");
//        }
}



