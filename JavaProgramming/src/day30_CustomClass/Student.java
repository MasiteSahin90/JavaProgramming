package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int IQ;
    public char grade;


    public void setInfo(String name, char gender, int age, int IQ, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.IQ = IQ;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", IQ=" + IQ +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

}
