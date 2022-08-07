package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try{
            System.out.println(9/0);
        }catch (ArithmeticException e){
            System.out.println("Catch block");
            System.out.println("Arithmetic exception was caugth");
        }

        System.out.println("Test1 completed");


        System.out.println("--------------------------");

        System.out.println("Test2 started");

        int[] arr = {1,2,3,4,5,6};

        try {
            System.out.println(arr[3444]);
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            System.out.println("Runtime exception was caugth");
        }





        System.out.println("Test2 completed");








    }
}
