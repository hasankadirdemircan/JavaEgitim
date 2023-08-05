package interface_real_example;

public class ECommerApp {
    public static void main(String[] args) {
        PaymetMehod creditPayment = new CreditCardPayment("234234234", "12/25");
        PaymetMehod paypalPayment = new PayPalPayment("example@email.com");

        double totalPrice = 100.50;
        creditPayment.processPayment(totalPrice);
        paypalPayment.processPayment(totalPrice);
    }
}
