class UPIPayment implements Payment, Refund {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " made via UPI.");
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refund of " + amount + " processed for UPI payment.");
    }
}