package day24_CustomMethods_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {

        nameOfMonths(66);
    }

    public static void nameOfMonths(int number){
        String name = "";

        if(number >1 && number>12) {
            System.out.println("invalid");
            return;
        }
          name = (number==1)?"january" :(number==2)? "february":(number==3)? "march":(number==4)? "april":(number==5)? "may"
                    :(number==6)? "june":(number==7)? "july":(number==8)? "august":(number==9)? "september":(number==10)? "october"
                    :(number==11)? "november" :"december";

        System.out.println(name);
    }
}
