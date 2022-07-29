package day28_ArraysList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "Masukk90";

        int countUppercase = 0;
        int countLowercase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {

            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUppercase++;
            } else if (Character.isLowerCase(each)) {
                countLowercase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            }else{
                countSpecialChar++;
            }


        }
        boolean hasUpper = countUppercase>0;
        boolean hasLower = countLowercase>0;
        boolean hasDigit = countDigits >0;
        boolean hasSpecialChar = countSpecialChar>0;

        //boolean strongPass = password.length()>=8 && !password.contains(" ")
          //      && hasDigit && hasLower && hasUpper && hasSpecialChar;

        boolean strongPass = false;

        if (password.length()>=8){
            if(!password.contains(" ")){
                if(hasDigit){
                    if(hasLower){
                        if(hasUpper){
                            if(hasSpecialChar){
                                strongPass = true;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(strongPass);
    }
}
