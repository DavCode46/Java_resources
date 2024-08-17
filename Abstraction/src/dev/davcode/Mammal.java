package dev.davcode;

public abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("fast")) {
            System.out.println(getExplicitType() + " Mammal is running");
        } else {
            System.out.println(getExplicitType() + " Mammal is walking");
        }
    }

    @Override
    public void makeNoise() {
        System.out.print(" Roar");
    }

    public abstract void shedHair();
}
