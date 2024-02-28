public class PaymentGateway {
    public static void main(String[] args) {
        // Simulate payment via Card
        Payment cardPayment = new CardPayment(); // Declare as Payment
        cardPayment.makePayment(100.0);
        ((Refund)cardPayment).refundPayment(20.0); // Explicit casting to Refund

        // Simulate payment via UPI
        Payment upiPayment = new UPIPayment(); // Declare as Payment
        upiPayment.makePayment(50.0);
        ((Refund)upiPayment).refundPayment(10.0); // Explicit casting to Refund
    }
}