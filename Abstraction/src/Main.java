import dev.davcode.*;
import dev.davcode.Animal;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog("dog", "small", 10.0);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("dog", "small", 10.0));
        animals.add(new Dog("wolf", "large", 50.0));
        animals.add(new Fish("Goldfish", "small", 0.5));
        animals.add(new Fish("Shark", "large", 500.0));

        animals.add(new Horse("Horse", "large", 1000.0));

        for(Animal animal : animals) {
            doAnimalStuff(animal);

            if(animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}