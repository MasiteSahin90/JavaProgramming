package day10_NestedIf;

public class TerneriesWithNestedIf {
    public static void main(String[] args) {

        int s = 85;
        if(s>=0 && s<=100 ){

            if(s>=60){
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }
        }else{
            System.out.println("invalid");
        }

        System.out.println("-------------------------");

        String result = (s>=0 && s<=100 )? (s>=60)?  "pass"
                : "fail" : "invalid";
        System.out.println(result);
    }
}
