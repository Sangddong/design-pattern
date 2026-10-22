public class OrderService {
    public void checkout(PaymentService paymentService, int amount) {
        paymentService.pay(amount);
    }
}
