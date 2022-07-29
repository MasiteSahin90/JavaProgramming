package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;
        System.out.println(num1< 0);
        System.out.println( num2<0);

        int a = 100;
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a);

        int b = 34;
        System.out.println(b++);
        System.out.println(b);

        int c = 366;
        System.out.println(c--);
        System.out.println(c);

        int d = 56;
        System.out.println(d++); //56
        System.out.println(d++); //57
        System.out.println(d--);  //58
        System.out.println(++d); //58
        System.out.println(--d); //57

        int f = 24;
        System.out.println(++f); //25
        System.out.println(--f); //24
        System.out.println(f++); //24
        System.out.println(f++); //25
        System.out.println(--f); //25
        System.out.println(++f); //26
        System.out.println(f);   //26
    }
}
