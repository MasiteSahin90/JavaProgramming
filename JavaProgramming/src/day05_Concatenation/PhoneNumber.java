package day05_Concatenation;

public class PhoneNumber {

    /*
countryCode = 1
areaCode = 703
localNumber = 4512625
output:
+1(703)-4512625
     */

    public static void main(String[] args) {
        int countryCode = 1,
                areaCode = 703,
                localNumber = 4512625;
        String phoneNumber =  countryCode + "(" + areaCode + ")-" + localNumber ;
        System.out.println(phoneNumber);

    }


}
