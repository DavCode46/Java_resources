package dev.davcode;

public class Jet implements FlightEnabled, Trackable {

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " Jet is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " Jet is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " Jet is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " Jet is being tracked");
    }
}
