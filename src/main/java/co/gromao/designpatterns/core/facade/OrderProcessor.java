package co.gromao.designpatterns.core.facade;

public class OrderProcessor {

    private StockChecker stockChecker;
    private PaymentService paymentService;
    private OrderShipper orderShipper;

    public OrderProcessor() {
        stockChecker = new StockChecker();
        paymentService = new PaymentService();
        orderShipper = new OrderShipper();
    }

    public void buy(String productId, int quantity) {
        if (stockChecker.checkStock(productId)) {
            paymentService.pay(productId, quantity);
            orderShipper.ship(productId);
        }
    }

}
