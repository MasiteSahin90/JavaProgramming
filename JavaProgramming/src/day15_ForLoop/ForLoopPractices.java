package day15_ForLoop;

import jdk.swing.interop.SwingInterOpUtils;

public class ForLoopPractices {
    public static void main(String[] args) {
        for( int i = 15 ; i<=45 ; i++){
            System.out.print( i + " ");
        }
        System.out.println(); //for next statement to start new line
        System.out.println("Hello World");


       for(int i = 100 ; i>=50 ; i--){
           System.out.print(i + " "); // i = 100 , 99 98 ... 50
       }
        System.out.println();

       for(int i = 1 ; i<=55 ; i++ ){
           if(i%2==0) {
               System.out.print(i + " ");
           }
       }
        System.out.println();

       for(int i = 2 ; i<=54 ; i+=2){
           System.out.print(i + " ");
       }






    }
}
