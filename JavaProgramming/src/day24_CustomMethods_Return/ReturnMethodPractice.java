package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {
      int maxNumber =  max(100,200);

        //System.out.println(maxNumber*2);

            int multiplication = maxNumber * 2;
        System.out.println("multiplication = " + multiplication);
    }

    public static int max(int a , int b){

        int result = 0;

        if(a>b){
            result = a;
        }else{
            result = b;
        }
        return result;
    }







}
