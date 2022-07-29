package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Masite";
        int age = 15 ;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote : " + isEligible);
        System.out.println("---------------------------");

        String name2 ="Josh";
        int age2 = 34;
        int creditScore = 720;
        int income = 236666;

        boolean isEligible2 = creditScore >= 700 && age2 >= 20 && income >=20000;

        System.out.println(name + " is eligible for loan: " + isEligible2);
        System.out.println("---------------------------");

        String name3 = "Reha";
        char gender = 'M';
        int age3 = 36;
        boolean isEligible3 = age3 >= 18 && (gender == 'F' || gender == 'M');

        System.out.println(name3 + " is eligible to register : " + isEligible3);
        System.out.println("---------------------------");

        String name4 = "James";
        String countryOfBirth ="UK";
        boolean marriedToUSCitizen = true;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true ;

        System.out.println(name4 + " is eligible to apply US citizenship : " + isEligible4);

        System.out.println("---------------------------");

        String Name5 = "Anna";
        double gpa = 3.5;
        int familyIncome = 2500;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 2000;

        System.out.println(name + " is eligible for scholarship : " + isEligible5);



















    }
}
