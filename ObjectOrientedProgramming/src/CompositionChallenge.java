public class CompositionChallenge {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();
        smartKitchen.setKitchenState(true, false, true);

        smartKitchen.doKitchenWork();
    }
}

class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator icebox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        icebox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIcebox() {
        return icebox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean brewCoffee, boolean orderFood, boolean doDishes) {
        brewMaster.setHasWordToDo(brewCoffee);
        icebox.setHasWordToDo(orderFood);
        dishWasher.setHasWordToDo(doDishes);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        icebox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {
    private boolean hasWordToDo;

    public void setHasWordToDo(boolean hasWordToDo) {
        this.hasWordToDo = hasWordToDo;
    }

    public void brewCoffee() {
        if(hasWordToDo) {
            System.out.println("Brewing coffee...");
        }
        hasWordToDo = false;
    }
}

class Refrigerator {
    private boolean hasWordToDo;

    public void setHasWordToDo(boolean hasWordToDo) {
        this.hasWordToDo = hasWordToDo;
    }

    public void orderFood() {
        if(hasWordToDo) {
            System.out.println("Ordering food...");
        }
        hasWordToDo = false;
    }
}

class DishWasher {
    private boolean hasWordToDo;

    public void setHasWordToDo(boolean hasWordToDo) {
        this.hasWordToDo = hasWordToDo;
    }

    public void doDishes() {
        if(hasWordToDo) {
            System.out.println("Washing dishes...");
        }
        hasWordToDo = false;
    }
}


