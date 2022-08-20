package day43_Abstraction.Employee;

public abstract class Person {

    private String name;
    private  int year;
    private final char gender;

    public Person(String name, int year, char gender) {
        setName(name);
        setYear(year);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isBlank()){
            throw new RuntimeException("name cant be empty");
        }
        this.name = name;
    }

    public void setYear(int year) {
        if (year<=1950){
            throw new RuntimeException("invalid year" + year);

        }
        this.year = year;
    }

    public void eat(String food){
        System.out.println(name + "is eating " + food);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", gender=" + gender +
                '}';
    }
}
