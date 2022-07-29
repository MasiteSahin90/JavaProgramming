package day10_NestedIf;

public class CharacterIdentitiy {
    public static void main(String[] args) {
        /*
        Create a class called Character Identity,
         and write a program that can identify if
          the given character is a digit or
           Alphabetic Character(A~Z or a~Z) or
           a special character
		Ex:
			ch = '@'
            output:
			Special Character
        HINT: You may wanna check out the
		 numbers of the chracters on ASCII table

         */
        char ch = 42 ;
        if (ch>=48 && ch<=57){
            System.out.println("digit");
        }else if (ch >= 65 && ch <=90 ||
                ch >= 97 && ch <=122 ){
            System.out.println("alphabetic");
        }else {
            System.out.println("special character");
        }
        // we chaged the ch variebles with the corresponding characters in the ascii table
    }
}
