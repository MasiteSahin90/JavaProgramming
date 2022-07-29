package day34_GarbageCollection_AccessModifiers;

import static Utilities.MathUtility.subtract;
import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static Utilities.MathUtility.*;
public class Test {

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("------------------------");

        int r1 = sum(10,20);

        int r2 = sum(100,200);

        int r3 = subtract(100,50);

        int r4 = max(1000,200);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);


    }
}
