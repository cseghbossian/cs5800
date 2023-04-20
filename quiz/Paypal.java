public class Paypal implements PaymentGateway {
    private String userEmail;

    public Paypal(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public void processPayment(double amount) {
        // call the paypal API using the amount and user email
        System.out.println("Paypal: processing payment of $" + amount + " from " + userEmail);

    }
}
