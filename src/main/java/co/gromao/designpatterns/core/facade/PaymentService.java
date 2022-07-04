package co.gromao.designpatterns.core.facade;

public class PaymentService {

    public void pay(String productId, int quantity) {
        System.out.println("Payment made for " + quantity + " " + productId + "'s");
    }

}
