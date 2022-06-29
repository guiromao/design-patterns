package co.gromao.designpatterns.core.decorator;

public class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        pizza.bake();
    }
}
