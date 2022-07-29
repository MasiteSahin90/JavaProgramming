package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int n = 0;
        boolean pos = n>0,
                neg = n<0,
                zero = n==0;
        if (pos){
            System.out.println("Positive");
        } else if (neg) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
