package day21_ForEachLoop;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9};

        int countodd = 0;
        int counteven = 0;

        for (int each : num) {
            if(each%2==0){
                counteven++;
            }else {
                countodd++;
            }

        }
        System.out.println("counteven = " + counteven);
        System.out.println("countodd = " + countodd);



    }
}
