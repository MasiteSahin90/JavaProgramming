package Day39_Recap.animalTask;

public class Dolphin extends FriendlyAnimal{


    public Dolphin(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayeble) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayeble);
    }

    public void swim(){
        System.out.println(getName() + " is swimming");
    }
}
