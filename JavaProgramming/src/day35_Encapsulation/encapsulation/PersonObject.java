package day35_Encapsulation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {
        Person p1 = new Person();

        //p1.name = "Ali";
        //p1.age = 30;

        p1.setName("Masite");
        p1.setAge(45);

        System.out.println(p1.getName() + " : " + p1.getAge());
    }
}
