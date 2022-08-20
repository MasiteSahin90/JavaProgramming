package day43_Abstraction.Employee;

public final class Teacher extends Employee{

    public Teacher(String name, int year, char gender, int ID, String jobTitle, double salary) {
        super(name, year, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getID() + getJobTitle() +  getName() + "is teaching" );
    }
}
