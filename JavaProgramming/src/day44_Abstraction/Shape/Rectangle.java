package day44_Abstraction.Shape;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        super("Rectangle");
        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<=0){
            throw new RuntimeException("invalid height");
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            throw new RuntimeException("invalid height");
        }
        this.width = width;
    }

    @Override
    public double area() {
        return height*width;
    }

    @Override
    public double perimeter() {
        return 2*(height+width);
    }
}
