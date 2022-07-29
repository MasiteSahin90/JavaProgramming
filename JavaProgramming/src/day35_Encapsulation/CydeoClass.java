package day35_Encapsulation;

public class CydeoClass {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoClass(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "cydeo ";
        programmingLanguage = "java";
        secretCode = "wooden spoon";
    }

    public static void printSchoolName(){
        System.out.println("school name is " + schoolName);
    }

    public static void printSecretCode(){
        System.out.println("secret code is " + secretCode);
    }

    public  void attend(){
        System.out.println(name + " is attending class" );
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoClass{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school" + schoolName + '\'' +
                ", programming language= " + programmingLanguage + '\'' +
                '}';
    }
}
