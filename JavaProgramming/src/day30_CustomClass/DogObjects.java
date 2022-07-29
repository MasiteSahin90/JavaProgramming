package day30_CustomClass;

public class DogObjects {

    public static void main(String[] args) {
       Dog dog1 = new Dog();

       dog1.name ="lucy";
        dog1.breed = "husky";
        dog1.age = 5;
        dog1.gender='f';
        dog1.size = "small";
        dog1.color = "white";

        System.out.println(dog1);


        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size= "large";
        dog2.color = "white";
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("jack","fifi",9,'m',"large","pink");
        System.out.println(dog3);

        dog2.bark();
        dog1.eat();

        Dog dog4 = new Dog();
        dog4.setInfo("hip","bulldog",7,'f',"large","purple");










    }

}
