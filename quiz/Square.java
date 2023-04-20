public class Square implements PaymentGateway {
    private String locationId;

    public Square(String locationId) {
        this.locationId = locationId;
    }

    @Override
    public void processPayment(double amount) {
        // call the square API using the amount and location ID
        System.out.println("Square: processing payment of $" + amount + " with location " + locationId);

    }
}