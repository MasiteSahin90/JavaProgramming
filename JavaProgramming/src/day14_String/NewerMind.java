package day14_String;


import java.util.Scanner;

public class NewerMind {
        /*
        ask the user to enter a word. if the word ends with "ly", print "really???" ,
         otherwise, print "never mind
         */

        public static void main(String[] args) {

                    Scanner scan = new Scanner(System.in);
                    System.out.println("enter a word");
                    String a = scan.nextLine();
                    String b = a.substring(a.length()-2);


                        if (b.equals("ly")){
                            System.out.println("really?");

                        }else{


                    System.out.println("never mind");

                }
                scan.close();
    }
}
