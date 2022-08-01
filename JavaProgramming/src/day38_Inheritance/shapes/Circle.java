package day38_Inheritance.shapes;

public class Circle extends Shapes {
    public Circle(double side) {
        super(side);
    }

    public double area(){
        System.out.println("area of the circle " + area());

        return pi*side*side;
    }

    public double perimeter(){
        System.out.println("perimeter of the circle " + perimeter());
        return  2*pi*side;
    }
}
