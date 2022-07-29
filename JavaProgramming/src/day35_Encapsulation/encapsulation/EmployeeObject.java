package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee e1 = new Employee("Masite",'F',31,100000);

        e1.setAge(28);
        System.out.println(e1);

        Employee e2 = new Employee("",'F',21,357844);

        e2.setName("Masite");
        e2.setAge(31);
        e2.setSalary(e2.getSalary()+20000);
        System.out.println(e2);
    }
}
