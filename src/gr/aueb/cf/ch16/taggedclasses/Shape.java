package gr.aueb.cf.ch16.taggedclasses;

public class Shape {
    private enum Type { RECTANGLE, CIRCLE }

    // Tag Field
    private final Type type;

    // Fields for Rectangle
    private double width;
    private double height;

    // Fields for Circle
    private double radius;

    // Constructor for Rectangle
    public Shape(double width, double height) {
        type = Type.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    // Constructor for Circle
    public Shape(double radius) {
        type = Type.CIRCLE;
        this.radius = radius;
    }

    public Type getType() {
        return type;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        switch (type) {
            case RECTANGLE:
                return width * height;
            case CIRCLE:
                return Math.PI * radius * radius;
            default:
                throw new AssertionError(type);
        }
    }
}
