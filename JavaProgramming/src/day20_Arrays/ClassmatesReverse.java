package day20_Arrays;

import java.util.Arrays;

public class ClassmatesReverse {
    public static void main(String[] args) {
        /*
        create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}
                output:
        			avaJ
        			nohtyp
        			#c
         */

        String[] array = {"ali","veli","ayse","ahmet"};

        /*for (int  j=0, i = array.length-1 ;   i <= 0 ;j++, i--) {
            reverse += array[j].charAt(i);
        }

        System.out.println(reverse);
*/

        for (int i = 0; i < array.length; i++) {
            String name = array[i];
            String reverse = "";
            for (int j = name.length()-1; j >=0 ; j--) {
                reverse += name.charAt(j);
            }
            System.out.println(reverse);
        }

    }
}
