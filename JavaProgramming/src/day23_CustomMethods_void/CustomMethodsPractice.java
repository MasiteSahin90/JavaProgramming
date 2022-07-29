package day23_CustomMethods_void;

public class CustomMethodsPractice {

  public static void main(String[] args) {
      helloWorld5Times();

      System.out.println("------------------------");

      HelloCydeo5Times();

      System.out.println("------------------------");

      evenNumbers();


    }

    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }

    }

    public static void HelloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("hello cydeo");
        }


    }

    public static void evenNumbers(){

        for (int i = 2 ; i <=10 ; i+=2) {
            System.out.println(i);
        }

    }

}
