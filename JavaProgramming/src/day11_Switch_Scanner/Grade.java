package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade = 'F';
        String result = "";
        switch (grade){
            case 'A':
                result = "excellent";
                break;
            case 'B':
                result = "great";
                break;
            case 'C':
                result = "good";
                break;
            case 'D':
                result = "pass";
                break;
            case 'F':
                result = "fail";
                break;
            default:
                result = "invalid grade";
                break;
        }

        System.out.println(result);
    }
}
