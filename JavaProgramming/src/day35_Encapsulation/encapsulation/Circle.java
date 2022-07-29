package day35_Encapsulation.encapsulation;


public class Circle {

    private double radius;
    public static double pi;

    static {
        pi = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <=0){
            return;
        }
        this.radius = radius;
    }

    public double calcArea(){

        return radius* radius * pi;
    }

    public double calcPerimeter(){

        return radius* 2 * pi;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", area= "+ calcArea()+ ", perimeter="+ calcPerimeter() +
                '}';
    }


}
