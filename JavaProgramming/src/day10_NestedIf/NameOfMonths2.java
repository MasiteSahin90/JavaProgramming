package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {
        int m = 99;
        String result = (m==1)? "january" :(m==2)? "february" :(m==3)? "march"
                :(m==4)? "april" :(m==5)? "may" :(m==6)? "june" :(m==7)? "july"
                :(m==8)? "august" :(m==9)? "september" :(m==10)? "october" :(m==11)?
                "november":(m==12)? "december": "invalid number";
        System.out.println( result);
    }
}
