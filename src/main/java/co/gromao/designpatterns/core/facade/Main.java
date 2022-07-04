package co.gromao.designpatterns.core.facade;

public class Main {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.buy("Laptop", 5);
    }

}
