import dev.davcode.DayOfTheWeek;
import dev.davcode.Topping;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.MON;
        System.out.println("Today is " + weekDay);

        for(int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
//            System.out.printf("Name is %s and ordinal value is %d%n", weekDay.name(), weekDay.ordinal());
//
//            if(weekDay == DayOfTheWeek.SUN) {
//                System.out.println("It's Sunday!");
//            }
            switchDayOfWeek(weekDay);
        }

        for(Topping topping : Topping.values()) {
            System.out.printf("The price of %s is $%.2f%n", topping, topping.getPrice());
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var days = DayOfTheWeek.values();

        return days[randomInteger];
    }

    public static void switchDayOfWeek(DayOfTheWeek day) {

        int weekDayInteger = day.ordinal() + 1;
        switch(day) {
            case WED -> System.out.println("Wednesday is day  " + weekDayInteger);
            case FRI -> System.out.println("Friday is day  " + weekDayInteger);
            case SUN -> System.out.println("Sunday is day  " + weekDayInteger);
            default -> System.out.println(day.name().charAt(0) +
                    day.name().substring(1).toLowerCase() +
                    " is day " + weekDayInteger);
        }

    }
}