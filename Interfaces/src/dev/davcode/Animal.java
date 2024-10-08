package dev.davcode;

enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED) {
            System.out.println("Tracking " + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
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

    FlightStages stage = FlightStages.GROUNDED;


    @Override
    public void takeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Flying");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }

    @Override
    public void achieveOrbit() {
        transition(getClass().getSimpleName() + " Satellite is achieving orbit");
    }

}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logState(FlightStages stage, String description) {
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logState(nextStage, "Transitioning to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();
    void land();
    void fly();

    default FlightStages transition(FlightStages stage){
//        System.out.println("Transition not implemented on " + getClass().getName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable {
    void track();
}

public abstract class Animal {
    public abstract void move();
}
