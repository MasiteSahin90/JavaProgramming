package Utilities;


public class MathUtility {

   public static int sum(int a ,int b){

       return a + b;

   }

    public static double sum(double a ,double b){

        return a + b;

    }

    public static int subtract(int a ,int b){

        return a - b;

    }

    public static double subtract(double a ,double b){

        return a + b;

    }

    public static int multiplication(int a ,int b){

        return a * b;

    }

    public static double multiplication(double a ,double b){

        return a * b;

    }

   /* public static int division(int a ,int b){

        return a / b;

    }
*/
    public static double division(double a ,double b){

        return a / b;

    }

    public static boolean isOdd( int a){
        return (a%2==1)? true : false;
    }

    public static boolean isEven( int a){
        return (a%2==0)? true : false;
    }

    public static int max (int a ,int b){
        return (a>b)? a:b;
    }

    public static double max (double a ,double b){
        return (a>b)? a:b;
    }

    public static int min (int a ,int b){
        return (a<b)? a:b;
    }

    public static double min (double a ,double b){
        return (a<b)? a:b;
    }

    public static int square(int a){
        return a*a;
    }

    public static double square(double a){
        return a*a;
    }

    public static int cube(int a){
        return a*a*a;
    }

    public static double cube(double a){
        return a*a*a;
    }






}
