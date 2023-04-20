//this is an app used for processing payments

public class PaymentProcessingApp {
    private PaymentGateway paymentGateway;

    public PaymentProcessingApp(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(double amount) {
        paymentGateway.processPayment(amount);
    }

    //this method is used to change payment method without consturcting new object
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}