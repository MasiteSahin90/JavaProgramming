package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog d1= new Dog();
        d1.setInfo("max", "husky",'F',2,"small","white");
        System.out.println(d1);
        d1.eat();
        d1.drink();
        d1.sleep();
        d1.move();
        d1.bark();


        Cat c1 = new Cat();
        c1.setInfo("fifi","scottish",'m',3,"small","grey");
        System.out.println(c1);
        c1.eat();
        c1.drink();
        c1.sleep();
        c1.move();
        c1.scratch();

        Tiger t1 = new Tiger();
        t1.setInfo("tiger","idk",'m',4,"large","orange");

        t1.hunt();
        t1.eat();
        t1.name = "tiggy";
        System.out.println(t1);
    }


}
