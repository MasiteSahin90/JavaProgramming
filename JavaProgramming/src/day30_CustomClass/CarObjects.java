package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "bmw";
        car1.model = "6.40";
        car1.color = "black";
        car1.year =2016;
        car1.price = 120000;

        System.out.println(car1);

        car1.start();
        car1.stop();
        car1.drive();

        Car car2 =new Car();
        car2.setInfo("mercedes","a1","green",2020,50000);

        System.out.println(car2);

        //Car[] cars = {car1,car2};

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2));

        for (Car each : carList) {
            System.out.println(each.brand + ":" + each.price);
        }
        carList.removeIf(p-> p.brand.equals("mercedes")&& p.year>=2005 && p.year<= 2025);
        carList.removeIf(p-> p.brand.equals("bmw")&& p.year>=2020 && p.year<=2025);

    }
}
