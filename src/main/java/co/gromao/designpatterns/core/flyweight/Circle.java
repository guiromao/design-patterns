package co.gromao.designpatterns.core.flyweight;

public class Circle extends Shape {

    private static final String LABEL = "Circle";

    @Override
    public void draw(int radius, String style) {
        System.out.println("Drawing a " + LABEL + " with radius of " + radius + " and style of " + style);
    }

}
