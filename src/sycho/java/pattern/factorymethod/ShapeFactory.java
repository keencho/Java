package sycho.java.pattern.factorymethod;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("SQUARE".equalsIgnoreCase(type)) {
            return new Square();
        }

        if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        }

        return null;
    }
}
