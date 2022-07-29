package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {

        String email = "masitesahinn@hotmail.com";

        email = email.substring(email.indexOf("@") + 1 , email.lastIndexOf("."));

        System.out.println("email = " + email);

        System.out.println("-------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0,10+1);

        String s2 = str1.substring(str1.indexOf(" J")+1,
                str1.lastIndexOf(","));

        String s3 = str1.substring(str1.indexOf("I"));

        System.out.println("s1 = " + s1);

        System.out.println("s2 = " + s2);

        System.out.println("s3 = " + s3);



    }
}
