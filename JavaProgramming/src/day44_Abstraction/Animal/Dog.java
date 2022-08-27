package day44_Abstraction.Animal;

public class Dog extends Animal implements barks, friendly,Fly{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating pizza");
    }

    @Override
    public void bark() {
        System.out.println(getName() + " is barking");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " dogs cant fly :)");
    }
}
