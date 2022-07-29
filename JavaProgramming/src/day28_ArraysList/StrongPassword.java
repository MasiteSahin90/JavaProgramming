package day28_ArraysList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo19990@";
        
        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean upper = false;
        boolean lower = false;
        boolean specialChar =false;
        boolean digit = false; 
        
        char [] ch = password.toCharArray();

        for (char each : ch) {

            if(Character.isUpperCase(each)){
                upper = true;
            } else if (Character.isLowerCase(each)) {
                lower = true;
            } else if (Character.isDigit(each)) {
               digit = true;
            }else {
                specialChar = true;
            }

           // if(r1 && upper && lower && specialChar && digit){
             //   break;
            //}
        }

        boolean isStrongPassword = upper && lower && digit && specialChar;

        System.out.println("strong " + isStrongPassword);
    }

    public static boolean isStrongPass(String password){

        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean upper = false;
        boolean lower = false;
        boolean specialChar =false;
        boolean digit = false;

        char [] ch = password.toCharArray();

        for (char each : ch) {

            if(Character.isUpperCase(each)){
                upper = true;
            } else if (Character.isLowerCase(each)) {
                lower = true;
            } else if (Character.isDigit(each)) {
                digit = true;
            }else {
                specialChar = true;
            }
        }

        boolean isStrongPassword = upper && lower && digit && specialChar;

        return isStrongPassword;
    }

}
