package day46_Polymorphism;

import day38_Inheritance.shapes.Rectangle;
import day43_Abstraction.Employee.*;
import day45_Interface.Shape.Circle;
import day45_Interface.Shape.Shape;
import day45_Interface.Shape.Square;
import day45_Interface.Task.FireFoxDriver;

import java.util.ArrayList;

public class PolymorphisimIntro {

    public static void main(String[] args) {

        String str = "wooden spoon";

        Double n2 = 2.5;

        Integer n1 = 2;

        Boolean r1 = true;

        Object[] array = { str , n1 , n2 ,r1 , new Circle(4) , new Square(5)};

        Employee tester = new Tester("Masite",1990,'F',12,"SDET",100000);
        Employee dvp = new Developer("ali",1988,'m',344,"developer",120000);
        Employee drv = new Driver("ahmet",1977,'m',4556,"driver",20000);
        Employee tchr= new Teacher("ayse",1988,'f',544,"maths teacher",50000);


        ArrayList<Employee> cydeoEmployees = new ArrayList<>();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(dvp);
        cydeoEmployees.add(drv);
        cydeoEmployees.add(tchr);

        System.out.println(cydeoEmployees);

        Employee employee = new Tester("Masite",1990,'F',12,"SDET",100000);
        employee.work();
        //employee.bugReport();


        Shape shape = new Circle(3);
        shape.area();

        boolean isSquare = shape instanceof Square;

        boolean isCircle = shape instanceof Circle;

        System.out.println(isSquare);
        System.out.println(isCircle);


        /*
        driver:

        if (driver instanceof Chrome){
            chrome browser will open
        }else if(driver instanceof firefox){
            FireFoxDriver browser will open
        }
*/











    }
}
