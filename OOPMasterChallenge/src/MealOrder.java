public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(String burgerType, String drinkType, String sideType) {
        if(burgerType.equalsIgnoreCase("Deluxe")) {
            this.burger = new DeluxeBurger();
        } else {
            this.burger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item(drinkType, "Drink", 1.5);
        this.side = new Item(sideType, "Side", 2.0);
    }

    public MealOrder() {
        this("Cheeseburger", "Coke", "Fries");
    }

    public double getTotalPrice() {

        if(burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedList() {

        burger.printItem();
        if(burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addTopping(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if(burger instanceof DeluxeBurger db) {
            db.addTopping(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addTopping(extra1, extra2, extra3);
        }

    }


    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
