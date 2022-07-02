package co.gromao.designpatterns.core.proxy;

public class Main {

    public static void main(String[] args) {
        Customer customer = new CustomerProxyImpl();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders());
    }

}
