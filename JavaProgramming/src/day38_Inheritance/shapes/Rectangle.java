package day38_Inheritance.shapes;

public class Rectangle extends Shapes {
    public Rectangle(double side , double side2) {
        super(side);
    }

    public double area(){
        System.out.println("area of the rectangle " + area());

        return pi*side*side;
    }

    public double perimeter(){
        System.out.println("perimeter of the rectangle " + perimeter());
        return  2;//*(side2+side);
    }




}
