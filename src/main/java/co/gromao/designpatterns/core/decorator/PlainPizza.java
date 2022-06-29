package co.gromao.designpatterns.core.decorator;

public class PlainPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking plain pizza...");
    }

}
