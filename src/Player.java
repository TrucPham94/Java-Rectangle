public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = health - damage;
        if (this.health <=0) {
            System.out.println("Player Knoc Out!");
        }
    }


    public int healthRemaining () {
        return this.health;
    }
}
