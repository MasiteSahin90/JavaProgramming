package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        String word = "masite";
        System.out.println("word = " + word);
        word = "sacide";
        System.out.println("word = " + word);
        word = "reha";
        System.out.println("word = " + word);
        //word = 123; it should be type of string because we initialized datatype as string

        // I have $2800.5 in my account i will withdraw $300 then deposit $500
        double accountBalance = 2800.5;
        System.out.println("accountBalance = $" + accountBalance);
        accountBalance -= 300;
        accountBalance += 500;
        System.out.println("accountBalance = $" + accountBalance );

        String word1 = "Wooden ";
        word1 += "Spoon";
        System.out.println("word1 = " + word1);
    }
}
