package co.gromao.designpatterns.core.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShapeFactory {

    private static Map<String, Shape> shapes = new HashMap<>();

    public static Shape createShape(String type) {
        if (Objects.nonNull(shapes.get(type))) {
            return shapes.get(type);
        } else {
            Shape shape = null;

            if ("circle".equals(type)) {
                shape = new Circle();
            } else if ("rectangle".equals(type)) {
                shape = new Rectangle();
            }

            return shape;
        }
    }

}
