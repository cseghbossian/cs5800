public class Stripe implements PaymentGateway {
    private String cardholderName;
    private String cardNumber;
    private String expirationDate;

    public Stripe(String cardholderName, String cardNumber, String expirationDate) {
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void processPayment(double amount) {
        // call the Stripe API with payment amount and card info
        System.out.println("Stripe: processing payment of $" + amount + " from " + cardholderName);

    }
}

