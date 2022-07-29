package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

   public String name;
   public static String schoolName;

   public CydeoStudent(String name){
       this.name = name;

   }

   static {
       schoolName = "Cydeo school";
   }


}


class CydeoStudentObject{

    public static void main(String[] args) {

        CydeoStudent s1 = new CydeoStudent("masite");
        CydeoStudent s2 = new CydeoStudent("reha");

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);

    }









}