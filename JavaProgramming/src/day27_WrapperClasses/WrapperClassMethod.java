package day27_WrapperClasses;

import java.util.SplittableRandom;

public class WrapperClassMethod {

    public static void main(String[] args) {

        String str = "123";

       int num = Integer.parseInt(str);

        System.out.println(num+1); //124
        System.out.println(str + 1); //1231

        String str2 = "11.2";
        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 2);

        int max = Integer.MAX_VALUE;

        int min = Integer.MIN_VALUE;

        System.out.println(max);

        System.out.println(min);

        long maxl = Long.MAX_VALUE;

        long minl = Long.MAX_VALUE;

        System.out.println(maxl);

        System.out.println(minl);

        System.out.println("-------------------------");

        String s1 = "true";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("-------------------------");

        String s2 = "123";

        Integer s3 = Integer.valueOf(s2);

        int nn = Integer.valueOf(s2);

        System.out.println(s3);

        System.out.println("nn" + nn);

        System.out.println("-------------------------");

        String s4 = "11.2";

        Double z = Double.valueOf(s4);

        System.out.println(z);

        System.out.println("-------------------------");

        //isDigit()

        char ch = '0';

        boolean r2 = Character.isDigit(ch);

        System.out.println(r2);

        //isLetter()

        boolean r3 = Character.isLetter(ch);

        System.out.println(r3);

        //special chars
        boolean r5 = !(Character.isLetterOrDigit(ch));

        System.out.println(r5);

        //uppercase

        boolean r6 = Character.isUpperCase(ch);

        boolean r7 = Character.isLowerCase(ch);

        System.out.println(r6);

        System.out.println(r7);

        System.out.println("-------------------------");

        String s = "12jnfdj578";
        int sum = 0;

        for (char each : s.toCharArray()){
            if(Character.isDigit(each))
            sum += Integer.parseInt(""+each);
        }

        System.out.println(sum);


    }
}
