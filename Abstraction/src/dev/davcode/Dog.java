package dev.davcode;

public class Dog extends Mammal{


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("fast")) {
            System.out.println(getExplicitType() + " Dog is running");
        } else {
            System.out.println(getExplicitType() + " Dog is walking");
        }
    }

    @Override
    public void makeNoise() {
        if(type.equals("wolf")) {
            System.out.print(" Howl");
        } else {
            System.out.print(" Bark");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " Dog is shedding hair");
    }
}
