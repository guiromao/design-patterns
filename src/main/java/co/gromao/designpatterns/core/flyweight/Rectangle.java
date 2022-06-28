package co.gromao.designpatterns.core.flyweight;

public class Rectangle extends Shape {

    private static final String LABEL = "Rectangle";

    @Override
    public void draw(int width, int height) {
        System.out.println("Drawing a " + LABEL + " with width of " + width + " and height of " + height);
    }

}
