package abstract_real_example;

public abstract class Enemy {
    int health;
    int damage;

    public abstract void attack(); //abstract method. Çünkü her düşmanın atağı farklıdır.

    public void takeDamage(int damage) {
        health = health - damage;
        System.out.println("Enemy is damaged : " + damage);
        System.out.println("enemy health is : " + health);

        if(health <= 0) {
            System.out.println("Enemy defeated. - is killed");
        }
    }
}
