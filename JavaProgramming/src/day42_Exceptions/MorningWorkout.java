package day42_Exceptions;

public class MorningWorkout {

    public static void main(String[] args) {

        System.out.println("--------Push up started");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\nPush up " + i);
            sleep(0.3);
        }
        System.out.println();
        System.out.println("---------- Push up completed ----------");

        System.out.println("--------------------------------------");

      System.out.println("--------Pull up started");

        for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPull up " + i);
            sleep(2.5);
        }
        System.out.println();
        System.out.println("---------- Push up completed ----------");
    }


    public static void sleep(double seconds){
        try {
            Thread.sleep((long) (seconds* 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}