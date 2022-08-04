package Day39_Recap.animalTask;

public class Animal {

    //instance variables
    private String name,breed;
    private char gender;
    private int age;
    private String size;
    private String color;


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || name == null){
            System.err.println("can not be empty");
            System.exit(1);
        }
        this.name = name;
    }

    public void setBreed(String breed) {
        if (name.isEmpty() || name.isBlank() || name == null){
            System.err.println("can not be empty");
            System.exit(1);
        }
        this.breed = breed;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender=='F')){
            System.err.println("invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age<=0) {
            System.err.println("invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        if (name.isEmpty() || name.isBlank() || name == null){
            System.err.println("can not be empty");
            System.exit(1);
        }
        this.color = color;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void move(){
        System.out.println(name + " is moving");
    }
}
