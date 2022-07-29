package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double r = input.nextDouble();
        double area = r * r * 3.14;
        double primeter = 2 * r * 3.14;
        System.out.println(area);
        System.out.println(primeter);
        input.close();
    }
}
