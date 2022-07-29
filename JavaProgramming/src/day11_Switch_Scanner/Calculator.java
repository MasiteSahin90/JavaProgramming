package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 =5,
                n2 =6;
        char operation ='%';
        boolean valid = operation == '+' || operation == '-'
                || operation == '*' || operation == '/';
        double result ;
        if (valid){
            switch (operation){
                case '+':
                  result = n1 + n2;
                  break;

                case '-':
                    result = n1 - n2;
                    break;

                case '*':
                    result = n1 * n2 ;
                    break;

                default:
                    result = n1 / n2;
            }

        }else {
            System.err.println("invalid operator: " + operation);
        }



    }
}
