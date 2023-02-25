package D04Prototype;

import D04Prototype.conponent.Circle;
import D04Prototype.conponent.Rectangle;
import D04Prototype.conponent.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型 / 克隆
 * @author zhyao
 * @date 2023/1/15 3:25
 */
public class Application {

    private List<Shape> shapes = new ArrayList<>();

    public Application() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(20);
        shapes.add(circle);
        Circle anotherCircle = circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(15);
        shapes.add(rectangle);

    }

    public void businessLogic() {
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
    }


    public static void main(String[] args) {

    }
}
