public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private NotificationService notificationService;
    private ReceiptService receiptService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.notificationService = new NotificationService();
        this.receiptService = new ReceiptService();
    }

    public void placeOrder(String menu, int amount) {
        inventoryService.decreaseStock(menu);
        paymentService.pay(amount);
        notificationService.send(menu + " 주문이 완료되었습니다.");
        receiptService.issue(menu, amount);
    }
}
