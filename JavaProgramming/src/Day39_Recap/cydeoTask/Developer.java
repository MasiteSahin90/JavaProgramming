package Day39_Recap.cydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs");
    }
    @Override
    public void work() {
        super.work();
    }
}
