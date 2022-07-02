package co.gromao.designpatterns.core.proxy;

import java.util.List;

public class CustomerImpl implements Customer {

    private int id;
    private List<Order> orders;

    public CustomerImpl() {
        this.id = 333;
    }

    @Override
    public String toString() {
        return "CustomerImpl{" +
                "id=" + id +
                ", orders=" + orders +
                '}';
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
