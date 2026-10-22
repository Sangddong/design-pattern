public class OldPaymentGatewayClient {
    public void requestPayment(String storeId, int price) {
        System.out.println("PG 결제 요청: 가맹점=" + storeId + ", 금액=" + price);
    }
}
