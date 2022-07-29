package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstname  = "Masite";
        String surname = "Sahin";
        int age = 31;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;
        String fullName = firstname + " " + surname ;
        System.out.println(" Full name of the person is " + fullName );
        System.out.println(fullName + " is " + age + " years old."  );
        System.out.println(fullName + " is " + jobTitle + " works at "+ companyName + " , " + fullName + " 's salary is " + salary + "$" );


    }
}
