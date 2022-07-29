package day32_Constructor;

public class EmployeeObject {

    public static void main(String[] args) {
        Employee e1= new Employee("masite");
        System.out.println(e1);

        Employee e2 = new Employee("masite",'F');
        System.out.println(e2);

        Employee e3 = new Employee("masite",'F',"SDET");
        System.out.println(e3);

        Employee e4 = new Employee("masite",'F',"SDET",200000);
        System.out.println(e4);
    }
}
