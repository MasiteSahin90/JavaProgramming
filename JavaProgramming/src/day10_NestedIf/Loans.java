package day10_NestedIf;

public class Loans {
    public static void main(String[] args) {
        /*
        Create a class called Loans, Given two variables
        salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
         */

        int salary = 78000;
        int creditScore = 678;

        String result = (salary > 60.000 && creditScore>650)? "loan approved" : "loan denied";

        System.out.println(result);

    }
}
