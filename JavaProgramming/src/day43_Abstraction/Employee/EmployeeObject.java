package day43_Abstraction.Employee;

public class EmployeeObject {

    public static void main(String[] args) {

        Tester tester = new Tester("Masite",1990,'F',12,"SDET",100000);
        Developer dvp = new Developer("ali",1988,'m',344,"developer",120000);
        Driver drv = new Driver("ahmet",1977,'m',4556,"driver",20000);
        Teacher tchr= new Teacher("ayse",1988,'f',544,"maths teacher",50000);


        System.out.println(tester);
        System.out.println(dvp);
        System.out.println(drv);
        System.out.println(tchr);


        tchr.work();
        tester.work();
        drv.work();
        dvp.work();

        tester.bugReport();
        tester.sleep();
        tchr.sleep();
        drv.sleep();
        dvp.sleep();

        tester.getName();
        dvp.setName("mahmut");
        tester.setSalary(120000);
        tchr.setSalary(60000);

        System.out.println(tester);
        System.out.println(dvp);
        System.out.println(drv);
        System.out.println(tchr);

    }
}
