package day19_RecapStringLoops;

public class Dublicate {
    public static void main(String[] args) {
        /*
        Write a program that can return the first duplicated character
from a string
         */

        String str = "aaabccccdd";
        String result = "";

        for (int j = 0; j < str.length() ; j++) {


            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    result+=ch;
                }
                if(count==1){
                    ;
                }

            }
            System.out.println(count);
        }




    }
}
