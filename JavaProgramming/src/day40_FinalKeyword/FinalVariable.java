package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay ;

    final static String name2;

    static {
        name2 = "Batch25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {




        final double pi = 3.14;

        //pi=4.14;       if you use final keyword you cant change the value
       // pi = 5.14;

        final String name;

        name = "Java";
        //name = "Wooden Spoon";

        FinalVariable obj = new FinalVariable("30/10/1990");

       // obj.birthDay = "may"; final varibles cant be reassign


        System.out.println(name2);
    }
}
