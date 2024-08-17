package dev.davcode;

public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("fast")) {
            System.out.println(getExplicitType() + " Darting frantically");
        } else {
            System.out.println(getExplicitType() + " Lazily swimming");
        }
    }

    @Override
    public void makeNoise() {
        if(type.equals("Goldfish")) {
            System.out.print(" swish");
        } else {
            System.out.print(" splash");
        }
    }
}
