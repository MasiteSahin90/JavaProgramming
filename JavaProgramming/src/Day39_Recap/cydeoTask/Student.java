package Day39_Recap.cydeoTask;

public class Student extends Employee {

    private int studentID;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int employeeID, String jobTitle, double salary, int studentID, String fieldOfStudy) {
        super(name, age, gender, employeeID, jobTitle, salary);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public  void study(){
        System.out.println(studentID + " " + getName() + " is studying");
    }
}
