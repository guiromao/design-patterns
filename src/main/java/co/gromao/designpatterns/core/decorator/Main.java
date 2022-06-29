package co.gromao.designpatterns.core.decorator;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();
    }

}
