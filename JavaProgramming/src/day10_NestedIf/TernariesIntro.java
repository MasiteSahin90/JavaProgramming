package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int number = 8;
        if(number % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        System.out.println("-----------------------");

       String result = (number % 2 == 0)? "even" : "odd";
        System.out.println(result);

        System.out.println("-----------------------");

        int age = 34;

       String result2 = (age>=21)? "eligible" : "not eligible";
        System.out.println(result2);
        System.out.println("-----------------------");
        System.out.println((age>=21)? "eligible" : "not eligible");

        System.out.println("-----------------------");

        int number2 = 0;
        if (number2>0){
            System.out.println("positive");
        }else if (number2 < 0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
        System.out.println("-----------------------");
       String result3 = (number2 >0)? "positive" : (number<0)?  ("negative") : ("zero");
        System.out.println(result3);






    }
}
