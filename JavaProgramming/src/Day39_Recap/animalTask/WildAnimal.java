package Day39_Recap.animalTask;

public class WildAnimal extends Animal  {

    private boolean isWild;
    private boolean isFriendly;
    private boolean isPlayeble;

    public boolean isWild() {
        return isWild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public boolean isPlayeble() {
        return isPlayeble;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public void setPlayeble(boolean playeble) {
        isPlayeble = playeble;
    }

    public WildAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayeble) {
        super(name, breed, gender, age, size, color);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayeble(isPlayeble);
    }

    public void hunt(){
        System.out.println(getName() + " is hunting");
    }













}
