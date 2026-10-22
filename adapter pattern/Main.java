public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        orderService.checkout(new CardPaymentService(), 5000);

        PaymentService oldPgPayment =
                new OldPaymentGatewayAdapter(new OldPaymentGatewayClient(), "CAFE001");
        orderService.checkout(oldPgPayment, 5000);
    }
}
