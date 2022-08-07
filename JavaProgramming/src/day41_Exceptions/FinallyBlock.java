package day41_Exceptions;

public class FinallyBlock {



    public static void main(String[] args) {

        int[] arr ={1,2,3};

        try {
            System.out.println(arr[10]);
        }catch (RuntimeException e){
            System.out.println("Catch block");
            e.printStackTrace();
            System.exit(0); // if you dont want to execute finally block the only way you need to apply systemexit
        }finally {
            System.out.println("Finally block");
        }





    }
}
