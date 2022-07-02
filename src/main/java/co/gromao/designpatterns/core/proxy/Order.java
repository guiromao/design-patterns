package co.gromao.designpatterns.core.proxy;

public class Order {

    private int id;
    private String name;
    private int quantity;

    public Order(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
