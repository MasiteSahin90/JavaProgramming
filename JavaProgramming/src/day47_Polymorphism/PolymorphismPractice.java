package day47_Polymorphism;

import day43_Abstraction.Car.Audi;
import day43_Abstraction.Car.Car;
import day43_Abstraction.Car.Honda;
import day43_Abstraction.Car.Tesla;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Car[] cars = {
                new Tesla("ndjm","kemdke",2000,3000),
                new Audi("ndjm","kemdke",2020,3000),
                new Honda("ndjm","kemdke",2012,3000)
        };


        for (Car each:cars) {

            /*if (each instanceof Tesla){
                if (each.year()<)
            }
*/


        }






    }
}
