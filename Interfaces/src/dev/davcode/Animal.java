package dev.davcode;

enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED) {
            System.out.println("Tracking " + this);
        }
    }
};
record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " DragonFly is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " DragonFly is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " DragonFly is flying");
    }
}


class Satellite implements OrbitEarth {
    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " Satellite is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " Satellite is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " Satellite is flying");
    }

    @Override
    public void achieveOrbit() {
        System.out.println(getClass().getSimpleName() + " Satellite is achieving orbit");
    }
}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();
}

interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();
    void land();
    void fly();
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}
