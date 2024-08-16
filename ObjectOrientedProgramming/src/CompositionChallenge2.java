public class CompositionChallenge2 {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

      bedroom.getLamp().turnOn();
    }
}

class Lamp {
    // Private member variables
    private String style;
    private boolean battery;
    private int globRating;

    // Constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    // Method to turn on the lamp
    public void turnOn() {
        System.out.print("Lamp -> Turning on");
    }

    // Getter for style
    public String getStyle() {
        return style;
    }

    // Getter for battery
    public boolean isBattery() {
        return battery;
    }

    // Getter for globRating
    public int getGlobRating() {
        return globRating;
    }
}

class Bed {
    // Private member variables
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    // Constructor
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    // Method to make the bed
    public void make() {
        System.out.print("Bed -> Making");
    }

    // Getter for style
    public String getStyle() {
        return style;
    }

    // Getter for pillows
    public int getPillows() {
        return pillows;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Getter for sheets
    public int getSheets() {
        return sheets;
    }

    // Getter for quilt
    public int getQuilt() {
        return quilt;
    }
}

class Ceiling {
    // Private member variables
    private int height;
    private int paintedColor;

    // Constructor
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Getter for paintedColor
    public int getPaintedColor() {
        return paintedColor;
    }
}

class Wall {
    // Private member variable
    private String direction;

    // Constructor
    public Wall(String direction) {
        this.direction = direction;
    }

    // Getter for direction
    public String getDirection() {
        return direction;
    }
}

 class Bedroom {
    // Private member variables
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    // Constructor
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    // Getter for lamp
    public Lamp getLamp() {
        return lamp;
    }

    // Method to make the bed
    public void makeBed() {
        // Start with the Bedroom message
        System.out.print("Bedroom -> Making bed | ");
        // Print the Bed message
        bed.make();
        // Add the separator and Lamp message
        System.out.print(" | ");

    }
}

