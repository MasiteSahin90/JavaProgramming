package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {


        String str1 = "   batch9   ";
        str1 = str1.trim();
        System.out.println(str1);

        System.out.println("----------------");

        String str2 = "masiteesahinn";

        int n = str2.indexOf("t");

        int n2 = str2.indexOf("ees");

        int n3 = str2.indexOf("inn");

        System.out.println("n = " + n);

        System.out.println("n2 = " + n2);

        System.out.println("n3 = " + n3);

        int n4 = str2.lastIndexOf("i");

        System.out.println("n4 = " + n4);

        System.out.println("----------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int thirdA = s.indexOf("a C");
        int forthA = s.lastIndexOf("ava");
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.indexOf("W") + 1;
        int seventhA = s.lastIndexOf("a ");

        System.out.println("firstA = " + firstA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("forthA = " + forthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);

    }
}
