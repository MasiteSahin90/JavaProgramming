package day38_Inheritance.shapes;

import java.util.concurrent.Callable;

public class ShapesObject {

    public static void main(String[] args) {

        Square s = new Square(7);

        Circle c = new Circle(3);

        Rectangle r = new Rectangle(3,4);

        System.out.println(s);
        System.out.println(c);
        System.out.println(r);

        s.setSide(5);

        System.out.println(s);

        r.setWidth(3);
        r.setLength(2);

        System.out.println(r);


        System.out.println(r.getLength());

        c.setRadius(7);
        System.out.println(c.getRadius());

        System.out.println(c.getName());


    }


}
