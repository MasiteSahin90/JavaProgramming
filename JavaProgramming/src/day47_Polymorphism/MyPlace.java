package day47_Polymorphism;

import day43_Abstraction.Car.Car;
import day43_Abstraction.Car.Tesla;
import day43_Abstraction.Employee.Driver;
import day43_Abstraction.Employee.Employee;
import day43_Abstraction.Employee.Person;
import day43_Abstraction.Employee.Tester;

public class MyPlace {


    public static void main(String[] args) {

        Car car = new Tesla("ndjn","blue",2022,34000);

        car.stop();

        Employee e1 = new Driver("emd",1994,'M',12,"driver",3222);

       // Driver driver = (Driver) e1;

        Person person = (Person) e1;

        e1.work();

       // Tester tester = (Tester) e1;













    }
}
