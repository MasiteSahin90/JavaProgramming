package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {

        String  word = "Cydeo School";

        String brand = word.substring(0 , 4+1);

        System.out.println("brand = " + brand);

        String str1 = word.substring(6);

        System.out.println(str1);

        String word2 = "Java johnny Language";

        String s2 = word2.substring(word2.indexOf(" ") +1 , word2.lastIndexOf( " "));

        System.out.println("s2 = " + s2);

        String a = "perfectly";
        String b = a.substring(a.lastIndexOf("l") );
        System.out.println("b = " + b);



    }
}
