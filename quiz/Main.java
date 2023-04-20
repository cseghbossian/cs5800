public class Main {

    public static void main(String[] args) {

        // Process payment via Paypal
        Paypal paypal = new Paypal("ndavarpanah@cpp.edu");
        PaymentProcessingApp paymentProcessor = new PaymentProcessingApp(paypal);
        paymentProcessor.processPayment(20);

        // Process payment via Stripe
        Stripe stripe = new Stripe("Celine Seghbossian", "1234 1234 1234 1234", "11/2024");
        paymentProcessor.setPaymentGateway(stripe);
        paymentProcessor.processPayment(39.99);

        // Process payment via Square
        Square square = new Square("Pomona, CA");
        paymentProcessor.setPaymentGateway(square);
        paymentProcessor.processPayment(1234.56);

    }
}