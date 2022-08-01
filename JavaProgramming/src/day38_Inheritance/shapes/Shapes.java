package day38_Inheritance.shapes;

public class Shapes {

    public double side ;
    public static double pi = 3.14;

    public Shapes(double side) {
        this.side = side;
    }

    public double area(){
        System.out.println("Area of the shape is " + area());
        return area();
    }

    public double perimeter(){
        System.out.println("Perimeter of the shape is " + perimeter());
        return perimeter();
    }

    public String toString() {
        return "Shapes{" +
                "side=" + side +
                '}';
    }
}
