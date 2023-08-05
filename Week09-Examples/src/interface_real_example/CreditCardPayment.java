package interface_real_example;

public class CreditCardPayment implements PaymetMehod{
    private String cardNumber;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment processed for amount : " + amount);
    }
}
