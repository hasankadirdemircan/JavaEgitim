package abstract_real_example;

public class Zombie extends Enemy {
    public Zombie() {
        health = 100;
        damage = 5;
    }

    @Override
    public void attack() {
        System.out.println("Zombie attacks with " + damage + " damage");
    }
}
