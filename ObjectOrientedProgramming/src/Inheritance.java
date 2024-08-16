public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", "Large", 100);
        doAnimalStuff(animal, "slow");

        Dog yorkie = new Dog("Yorkie", 10);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Golden Retriever", 70, "floppy", "straight");
        doAnimalStuff(retriever, "medium");

        Dog wolf = new Dog("Wolf", 90);
        doAnimalStuff(wolf, "fast");

        Fish goldie = new Fish("Goldfish", 1, 2, 2);
        doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_________________________");
    }


}
 class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal() {

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

     @Override
     public String toString() {
         return "Animal{" +
                 "type='" + type + '\'' +
                 ", size='" + size + '\'' +
                 ", weight=" + weight +
                 '}';
     }

     public void move(String speed) {
            System.out.println(type + "Animal is moving at " + speed);
     }

     public void makeNoise() {
         System.out.println(type + "Animal is making noise");
     }
 }

 class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Dog", "Medium", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "pointy", "curly");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

     @Override
     public String toString() {
         return "Dog{" +
                 "earShape='" + earShape + '\'' +
                 ", tailShape='" + tailShape + '\'' +
                 "} " + super.toString();
     }

     @Override
     public void makeNoise() {
        if(type.equals("Wolf")) {
            System.out.println("Wolf is howling");
        }
        else {
            bark();
            System.out.println();
        }
     }

     @Override
     public void move(String speed) {
         super.move(speed);
         if(speed.equals("slow")) {
             walk();
             wagTail();
         } else {
             run();
             bark();
         }
     }

     private void bark() {
            System.out.print("Dog is barking");
     }

     private void run() {
            System.out.print("Dog is running");
     }

     private void walk() {
            System.out.print("Dog is walking");
     }

     private void wagTail() {
            System.out.print("Dog is wagging tail");
     }
 }

 class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.print("Fish is moving muscles");
    }

    private void moveBackFin() {
        System.out.print("Fish is moving back fin");
    }

    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed.equals("fast")) {
            moveBackFin();
        }
        System.out.println();
    }

     @Override
     public String toString() {
         return "Fish{" +
                 "gills=" + gills +
                 ", fins=" + fins +
                 "} " + super.toString();
     }
 }