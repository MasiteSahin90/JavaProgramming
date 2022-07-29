package day23_CustomMethods_void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(8);

        ageOfPerson(1990);

        printNumbers(3,9);
    }


    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number + " is even");
        }else {
            System.out.println(number + " is odd");
        }


    }

    public static void ageOfPerson(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("Your age is " + age);
    }

    public static void printNumbers(int x , int y){

        for (int i = x; i < y; i++) {
            System.out.println(i);

        }
    }




}







