package day24_CustomMethods_Return;

public class ReturnMethodsPractice3 {

    public static void main(String[] args) {

        String str = "aabccdd";

        for (int i = 0; i < str.length() ; i++) {
           int frequency = frequency(str,str.charAt(i));

            if(frequency == 1){
                System.out.println(str.charAt(i) + " is unique");
            }
        }

    }

    public static int frequency(String str , char ch) {


        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }



}