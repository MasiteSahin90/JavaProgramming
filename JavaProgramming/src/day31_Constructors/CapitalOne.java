package day31_Constructors;

public class CapitalOne {

    public static void main(String[] args) {


        BankAccount a1 = new BankAccount();
        a1.setInfo("masite ssahin",1234567890);
        System.out.println(a1);

        a1.deposit(1000000000);
        a1.checkBlance();

        a1.withdraw(900);
        a1.checkBlance();

        BankAccount a2 = new BankAccount();
        a2.setInfo("reha ssahin",1234567890);
        System.out.println(a1);

        a2.deposit(2000000000);
        a2.checkBlance();

        a2.withdraw(1000);
        a2.checkBlance();


    }
}
