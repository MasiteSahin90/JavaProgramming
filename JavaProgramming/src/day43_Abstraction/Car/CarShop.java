package day43_Abstraction.Car;

public class CarShop {

    public static void main(String[] args) {

       // Car honda = new Car()
        //we cannot create object from abstract class because abstract class is not concrate


        Honda honda = new Honda("Accord","white",2019,3000);
        Audi audi = new Audi("A4","black",2020,3000);
        Tesla tesla = new Tesla("model 3","yellow",2021,40000);

        System.out.println("honda = " + honda);
        System.out.println("audi = " + audi);
        System.out.println("tesla = " + tesla);

        honda.setColor("grey");
        audi.setColor("bluue");
        tesla.setColor("pink");

       honda.setPrice(20000.0);
        audi.setPrice(38000.0);
        tesla.setPrice(45000.0);

        System.out.println("honda = " + honda);
        System.out.println("audi = " + audi);
        System.out.println("tesla = " + tesla);


        honda.start();
        tesla.stop();
        audi.start();








    }
}
