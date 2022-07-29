package day33_Statics;

public class Person {
    /*
    Person Task:
1. Create a class named Person:
Attributes:
instance: name, age, gender
static: isHuman(boolean),
hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
Add a constructor that can set All the
fields (instances)
Actions:
eat(String food)
drink(String drink)
sleep()
toString()
     */

    public String name;
    public int age;
    public char gender;
    public static boolean isHuman = true;
    public static boolean hasNose= true;
    public static boolean hasWings = false;
    public static int numberOfHeads=1;

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking" + drink);
    }


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
