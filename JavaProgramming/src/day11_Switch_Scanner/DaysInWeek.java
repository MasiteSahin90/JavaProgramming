package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int n = 9;
        String result = "";

        switch (n){
                case 1:
                result = "monday";
                break;
                case 2:
                result = "tuesday";
                break;
                case 3:
                result = "wednesday";
                break;
                case 4:
                result = "thursday";
                break;
                case 5:
                result = "friday";
                break;
                case 6:
                result = "saturday";
                break;
                case 7:
                result = "sunday";
                break;
            default:
                result = "invalid number";
                break;

        }
        System.out.println(result);
    }
}
