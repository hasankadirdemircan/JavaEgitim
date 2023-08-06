package abstract_real_example;

public class Goblin extends Enemy {

    int health = 20;

    public Goblin() {
        health = 50;
        damage = 10;
    }

    @Override
    public void attack() {
        System.out.println("Goblin attacks with " + damage + " damage");
    }
}
