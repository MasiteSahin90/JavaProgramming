package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is the best, I love Java";
        String str2 = str.replace("Java","Python" );

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


        String email = "masitesahinn@yahoo.com";
        String email2 = email.replace("yahoo","hotmail");

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        String sentence = "java java java python java java python ";
        String sentence2 = sentence.replace("python " , "");
        sentence2 = sentence2.replace("   ", "");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog" , "Cat");

        System.out.println("s = " + s);

        String s2 = "C# is fun C# is cool";

        s2 = s2.replace(" C#", "Java");

        System.out.println("s2 = " + s2);

        String s3 = "Java";

        s3 = s3.replace("a" , "e");

        System.out.println("s3 = " + s3);

        System.out.println("-----------------------");

        String result = "Java Java Java Java Java";

                result = result.replaceFirst("Java", "Python");

        System.out.println("result = " + result);

        String result2 = "C# is fun C# is cool";

        result2 = result2.replaceFirst("C#", "Java");

        System.out.println("result2 = " + result2);

        String result3 = "C# is fun C# is cool";

        result3 = result3.replaceFirst(" C#" , " Java");

        System.out.println("result3 = " + result3);
    }
}
