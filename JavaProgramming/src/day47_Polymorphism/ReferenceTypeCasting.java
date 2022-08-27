package day47_Polymorphism;

import day44_Abstraction.Animal.Animal;
import day44_Abstraction.Animal.Dog;
import day45_Interface.Shape.Circle;
import day45_Interface.Shape.Shape;
import day45_Interface.Task.ChromeDriver;
import day45_Interface.Task.WebDriver;

public class ReferenceTypeCasting {


    public static void main(String[] args) {


        Shape shape = new Circle(4);

        Shape shape2 = new Circle(2);

        WebDriver driver = new ChromeDriver("chrome");

        Animal animal = new Dog("max","husky",'M',2,"small","white");

        Dog dog = (Dog) animal;

        dog.eat();
        animal.drink();

        Dog dog2 = new Dog("max","husky",'M',2,"small","white");

        Dog dog3 = dog2;

        //Dog animal = dog;

        ((Dog) animal).bark();
        dog3.bark();











    }
}
