package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 90 ;
        int n2 = 90;
        boolean n1Min = n1 < n2 ;
        boolean n2Min = n2 < n1 ;
        boolean equal = n1 == n2 ;
        if(n1Min){
            System.out.println( n1 + " is the minimum number");
        } else if (n2Min) {
            System.out.println( n2 + " is the minimum number");
        }else
            System.out.println("equal");
    }
}
