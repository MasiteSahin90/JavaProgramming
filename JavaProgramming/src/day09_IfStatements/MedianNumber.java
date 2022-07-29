package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int n1 = 38,
                n2 = 68,
                n3 = 45;
         boolean n1medianNumber = (n1>n2 && n1<n3) || (n1 > n3 && n1< n2),
                 n2medianNumber = (n2>n1 && n2< n3) || (n2> n3 && n2< n1),
                 n3medianNumber = !n1medianNumber && !n2medianNumber;

         if(n1medianNumber){
             System.out.println(n1 + " is the median number");
         }
        if(n2medianNumber){
            System.out.println(n2 + " is the median number");
        }
        if(n3medianNumber){
            System.out.println(n3 + " is the median number");
        }
    }
}
