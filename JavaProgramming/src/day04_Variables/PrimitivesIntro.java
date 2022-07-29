package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {
        //age:38
        byte age = 38;
        // weight: 160 pounds
        //byte weight = 160; it's not in byte's range

        short weigth = 160; // 160 within the range

        //salary:100000 $
        //short salary = 100000 $; not in shorts range

        int salary = 100000; // preferred data type is int
                            /* to make it readable
                            dont use any comma or dot
                            just use _ if you want */

        long asset = 3_333_333_333L; /* if you want to use
                                       long , you need to put
                                       L. you need to force to
                                       compile to use it*/
                //tax: 0.26
        /* you cant use integers
        for the decimals
         */
        float tax = 0.26F; // again you need to force it to use by F
                            // not to be in an error
        //double tax = 0.26; // we will be using int and double

    }
}
