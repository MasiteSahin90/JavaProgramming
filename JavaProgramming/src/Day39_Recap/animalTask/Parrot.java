package Day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal {


    public Parrot(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayeble) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayeble);
    }

    public void fly(){
        System.out.println(getName() + " is flying");
    }

    public void sing(){
        System.out.println(getName() + " is singing");
    }


}
