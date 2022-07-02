package co.gromao.designpatterns.core.proxy;

import java.util.List;

public class CustomerProxyImpl implements Customer {

    private CustomerImpl customer = new CustomerImpl();

    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        return List.of(
                new Order(1, "Mouse", 10),
                new Order(2, "Laptop", 20)
        );
    }

    public void setId(int id) {
        customer.setId(id);
    }

}
