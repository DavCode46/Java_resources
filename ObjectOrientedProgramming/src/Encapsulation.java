public class Encapsulation {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.healthRemaining());

        player.loseHealth(20);
        System.out.println("Remaining health is " + player.healthRemaining());

        player.loseHealth(100);
        System.out.println("Remaining health is " + player.healthRemaining());
    }
}

class EnhancedPlayer {
    private String fullName;
    private int healthPercetage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if(health <= 0) {
            this.healthPercetage = 1;
        } else if(health > 100) {
            this.healthPercetage = 100;
        } else {
            this.healthPercetage = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.healthPercetage -= damage;
        if(this.healthPercetage <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.healthPercetage;
    }

    public String getName() {
        return fullName;
    }
}
