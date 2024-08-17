package dev.davcode;

public class Bird extends Animal implements FlightEnabled, Trackable {

    public void move() {
        System.out.println("Bird is moving");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " Bird is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " Bird is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " Bird is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " Bird is being tracked");
    }
}
