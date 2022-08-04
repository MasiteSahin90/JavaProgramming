package Day39_Recap.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat= new Cat("mavis","Felix",'F',2,"medium","Black and white",
                false,true,true);

        Dog dog= new Dog("kara","Kangal",'M',4,"Large","beige",
                true,false,true);

        Dolphin dolphin= new Dolphin("jj","bottlenose dolphin",'M',5,"Large",
                "white",true,false,false);

        Parrot parrot= new Parrot("sarisin","Afrigan grey",'F',2,"small",
                "grey",true,true,true);

        cat.meow();
        System.out.println(cat.getName());
        dog.bark();
        System.out.println(dog.getBreed());
        dolphin.swim();
        dolphin.setName("Alvin");
        parrot.fly();
        System.out.println(parrot.getAge());


        Tiger tiger=new Tiger("tiger","Siberian",'F',10,"Large","Mix",
                true,false,false);
        Lion lion= new Lion("leo","African lion",'M',15,"Large","Mix",
                true,false,false);
        Eagle eagle= new Eagle("karabas","Bold eagle",'M',4,"Medium","Brown",
                true,false,false);

        tiger.hunt();
        System.out.println(tiger.getName());
        System.out.println(lion.isFriendly());
        eagle.hunt();








    }
}
