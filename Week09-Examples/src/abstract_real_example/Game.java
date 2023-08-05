package abstract_real_example;

import sun.nio.cs.ext.GBK;

public class Game {
    public static void main(String[] args) {
        Enemy goblin = new Goblin();
        Enemy zombie = new Zombie();

        goblin.attack();
        zombie.attack();


        zombie.takeDamage(20);
        zombie.takeDamage(50);
        zombie.takeDamage(60);
    }
}
