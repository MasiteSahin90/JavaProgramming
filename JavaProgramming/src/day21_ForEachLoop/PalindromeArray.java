package day21_ForEachLoop;

import java.util.Arrays;

public class PalindromeArray {

    public static void main(String[] args){

    /*  for(String each : words) {

            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
        if(each.equalsIgnoreCase(reversed)){
            count ++;
        }

        }
        System.out.println(count);
    */

        String [] words = {"anna", "level", "Java"};
        int count = 0;

        for (String each : words) {
           String reversed = "";
           for(int i = each.length() -1 ; i>=0; i--){
               reversed += each.charAt(i);

           }
            if (each.equalsIgnoreCase(reversed)){
                count++;

            }

        }
        System.out.println(count);




    }



}
