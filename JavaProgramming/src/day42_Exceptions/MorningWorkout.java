package day42_Exceptions;

public class MorningWorkout {

    public static void main(String[] args) {

        System.out.println("--------Push up started");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\nPush up " + i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("---------- Push up completed ----------");

        System.out.println("--------------------------------------");

       /* System.out.println("--------Pull up started");

        for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPull up " + i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("---------- Push up completed ----------");
    }*/
    }
}