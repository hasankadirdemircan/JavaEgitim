package class_examples;

public class Customer {
    static double PERCENT_VALUE = 0.1;

    double balance;

    boolean isPremium;

    public double spendMoney(double price) {
        return balance - price;
    }
}
