//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("Coke", "Drink", 1.5);
//        coke.printItem();
//        coke.setSize("Large");
//        coke.printItem();
//
//        Item avocado = new Item("Avocado", "Topping", 2.5);
//        avocado.printItem();
//
//        Burger burger = new Burger("Cheeseburger", 5.0);
//        burger.addTopping("Cheese", "Bacon", "Avocado");
//        burger.printItem();
//
//        MealOrder order = new MealOrder();
//
//        order.addBurgerToppings("Cheese", "MAYO", "Avocado");
//        order.setDrinkSize("Large");
//        order.printItemizedList();

//        MealOrder order2 = new MealOrder("BACONBURGER", "PEPSI", "FRIES");
//        order2.setDrinkSize("SMALL");
//        order2.printItemizedList();

        MealOrder order3 = new MealOrder("DELUXE", "SPRITE", "ONION RINGS");
        order3.addBurgerToppings("CHEESE", "BACON", "AVOCADO", "MUSHROOMS", "ONIONS");
        order3.setDrinkSize("SMALL");
        order3.printItemizedList();
    }
}