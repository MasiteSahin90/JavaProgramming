package day13_String;


public class StringMethods {
    public static void main(String[] args) {


        String word = "masiteeeeeeee";

        char thirdch = word.charAt(3);

        String ch = "" + thirdch ;

        System.out.println("ch = " + ch);

        char tenthch = word.charAt(9);
        System.out.println("tenthch = " + tenthch);

        System.out.println("--------------------");

        String sentence = "pazara gidelim bir tavuk alalim";

        int totalChars = sentence.length();

        System.out.println("totalChars = " + totalChars);

        System.out.println("--------------------");

        char lastchar = sentence.charAt(sentence.length() - 1);

        System.out.println("lastchar = " + lastchar);

        System.out.println("--------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println("str = " + str);

        System.out.println("--------------------");

        String sentnce = "PAZARA GIDELIM BIR TAVUK ALALIM";
        sentnce = sentnce.toLowerCase();
        System.out.println("sentnce = " + sentnce);



    }
}
