package dev.davcode;

public class Horse extends Mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        System.out.print(" Neigh");
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " Horse is shedding hair");
    }
}
