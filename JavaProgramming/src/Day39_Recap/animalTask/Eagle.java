package Day39_Recap.animalTask;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayeble) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayeble);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting rabbit");
    }
}
