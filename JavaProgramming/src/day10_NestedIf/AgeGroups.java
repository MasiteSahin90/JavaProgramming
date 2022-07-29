package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        Create a class called AgeGroups, write a program that can
        define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
        int age = 180;
        String result2 = "";
        if (age >=0 && age <=150 ){
            if (age>=55){
                result2 = "senior";
            } else if (age >= 21 ) {
                result2 = "adult";
            }else {
                result2 = "teenager";
            }

        }else{
            result2 = "invalid";
        }

        System.out.println(result2);



    }
}
