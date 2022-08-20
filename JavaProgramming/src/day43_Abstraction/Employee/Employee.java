package day43_Abstraction.Employee;

public abstract class Employee extends Person {


    private final int ID;
    private String jobTitle;
    private double salary;

    public Employee(String name, int year, char gender, int ID, String jobTitle, double salary) {
        super(name, year, gender);
        if (ID<=0){
            throw new RuntimeException("invalid id" + ID);
        }
        this.ID = ID;
        setJobTitle(jobTitle);
        setSalary(salary);

    }

    public int getID() {
        return ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "Person{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", gender=" + getGender() +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
