package co.gromao.designpatterns.core.facade;

public class OrderShipper {

    public void ship(String productId) {
        System.out.println("Shipping " + productId);
    }

}
