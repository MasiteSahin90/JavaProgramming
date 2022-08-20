package day43_Abstraction.Employee;

public final class Tester extends Employee{

    public Tester(String name, int year, char gender, int ID, String jobTitle, double salary) {
        super(name, year, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getID() + getJobTitle() +  getName() + "is testing" );
    }

   public void bugReport(){
       System.out.println(getID() + " " + getName() + " is creating a bug report");
   }
}
