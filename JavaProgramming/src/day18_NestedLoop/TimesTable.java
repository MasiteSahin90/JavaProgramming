package day18_NestedLoop;

public class TimesTable {
    public static void main(String[] args) {
        int mult = 0;

        for (int i =1 ; i <11 ; i++) {
            for (int j = 1; j <11 ; j++) {
                mult = i*j;
                System.out.print(mult + "\t");
            }
            System.out.println();
        }


    }
}
