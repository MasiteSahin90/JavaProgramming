package day38_Inheritance.shapes;

public class Square extends Shapes{
    public Square(double side) {
        super(side);
    }

    public double area(){
        System.out.println("area of the square " + area());

        return side*side;
    }

    public double perimeter(){
        System.out.println("perimeter of the square " + perimeter());
        return  4*side;
    }









}
