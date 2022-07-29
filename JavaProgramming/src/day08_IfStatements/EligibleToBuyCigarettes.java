package day08_IfStatements;

public class EligibleToBuyCigarettes {
    public static void main(String[] args) {
        // 1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
        byte age = 26;
        boolean eligibleToBuy = age >= 18;
        boolean notEligibleToBuy = age <18;

        System.out.println(age + " is eligible to buy cigarettes:" + eligibleToBuy);
        System.out.println(age + " is not eligible to buy cigarettes:" + notEligibleToBuy);
        System.out.println("------------------------------");


        if (age >= 18){
            System.out.println(age + " is eligible to buy cigarettes.");
        }else{
            System.out.println(age + " is not eligible to buy cigarettes.");
        }

    }

}
