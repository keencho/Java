package sycho.java.pattern.factorymethod;

public class FactoryMethodClient {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.getShape("SQUARE");
        s1.draw();

        Shape s2 = shapeFactory.getShape("RECTANGLE");
        s2.draw();
    }
}
