package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 9;
        String result = "";

        if (gradeLevel <=18 && gradeLevel>=1){

            switch (gradeLevel){
                case 1: case 2: case 3: case 4: case 5:
                    result = "elementary school";
                    break;
                case 6: case 7: case 8:
                    result = "middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    result = "high school";
                    break;
                case 13: case 14: case 15: case 16:
                    result = "collage";
                    break;
                default:
                    result = "grad school";

            }
        }else {
            result = "invalid grade";
        }
        System.out.println(result);
    }

}
