package Day39_Recap.animalTask;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayeble) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayeble);
    }

    @Override
    public void eat() {
        System.out.println(getName() + getBreed() + " is eating cat food ");
    }

    public void scratch(){
        System.out.println(getName() + " is scratching");
    }

    public void meow(){
        System.out.println(getName() + " is meowing");
    }

}
