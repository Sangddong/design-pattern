public class OldPaymentGatewayAdapter implements PaymentService {
    private OldPaymentGatewayClient client;
    private String storeId;

    public OldPaymentGatewayAdapter(OldPaymentGatewayClient client, String storeId) {
        this.client = client;
        this.storeId = storeId;
    }

    @Override
    public void pay(int amount) {
        client.requestPayment(storeId, amount);
    }
}
