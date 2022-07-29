package day24_CustomMethods_Return;

public class Return_vsExitMethod {
    public static void main(String[] args) {
         nameOfMonths(80);

        System.out.println("hello world");
    }


    public static void nameOfMonths(int number){
        String name = "";

        if(number >1 && number>12) {
            System.out.println("invalid");
            System.exit(0);
        }
        name = (number==1)?"january" :(number==2)? "february":(number==3)? "march":(number==4)? "april":(number==5)? "may"
                :(number==6)? "june":(number==7)? "july":(number==8)? "august":(number==9)? "september":(number==10)? "october"
                :(number==11)? "november" :"december";

        System.out.println(name);
    }
}
