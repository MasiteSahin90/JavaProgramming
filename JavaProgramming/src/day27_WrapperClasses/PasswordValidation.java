package day27_WrapperClasses;

import java.util.Scanner;

public class PasswordValidation {

    /*
    8 karakter
    has uppercase
    has lowercase
    has digit
    has char
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("password: ");
        String password = scan.next();

        scan.close();

        char[] pass = password.toCharArray();

        boolean isDigit = false;
        boolean isLetter = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean specialchar = false;
        boolean space = false;
        //boolean strong = true;

        if (pass.length<8){
            System.out.println("invalid");
            System.exit(0);
        }

            for (char each : pass) {
                if(!(Character.isLetterOrDigit(each))){
                    specialchar = true;
                }

                if (Character.isDigit(each)){
                    isDigit = true;
                }

                if (Character.isLetter(each)){
                    isLetter = true;
                }

                if (Character.isLowerCase(each)){
                    hasLowercase = true;
                }

                if (Character.isUpperCase(each)){
                    hasUppercase =  true;
                }

                if(each == ' '){
                    space = true;
                }
            }
            if (specialchar && isDigit && isLetter && hasLowercase && hasUppercase && !space){
                System.out.println("strong");
            }else{
                System.out.println("not strong");
            }



    }
}
