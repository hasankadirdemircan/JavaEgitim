package interface_real_example;

public class PayPalPayment implements PaymetMehod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment processed for amount : " + amount);
    }
}
