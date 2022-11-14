package lab.designpatterns.factory;

public class ShapeFactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.newInstance();
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();
    }
}
