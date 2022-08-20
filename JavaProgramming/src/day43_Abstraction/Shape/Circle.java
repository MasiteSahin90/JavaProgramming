package day43_Abstraction.Shape;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException("invalid height");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        return 2*radius*3.14;
    }
}
