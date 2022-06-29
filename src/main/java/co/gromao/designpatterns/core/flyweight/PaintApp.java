package co.gromao.designpatterns.core.flyweight;

public class PaintApp {

    public void paintShapes(int numberOfShapes) {
        Shape shape;

        for (int i = 0; i < numberOfShapes; i++) {
            if (i % 2 == 0) {
                shape = ShapeFactory.createShape("circle");
                shape.draw(i + 1, "dotted");
            } else {
                shape = ShapeFactory.createShape("rectangle");
                shape.draw(i + 1, (i + 1) * 2);
            }
        }
    }

    public static void main(String[] args) {
        PaintApp app = new PaintApp();

        app.paintShapes(10);
    }

}
