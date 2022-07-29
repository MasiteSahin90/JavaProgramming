package day09_IfStatements;

import java.util.Scanner;

public class EqualNumbers {
    /*
   Create a class called EqualNumbers,
   and write a program that can check the equality of
   the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = input.nextInt();
        System.out.println("enter an integer");
        int b = input.nextInt();
        System.out.println("enter an integer");
        int c = input.nextInt();
        if (a== b&& a==c){
            System.out.println("integers are equal");
        } else if (a==b && a!=c) {
            System.out.println("a&b are equal");
        }else if (a==c && a!=b) {
            System.out.println("a&c are equal");
        }else if (c==b && b!=a) {
            System.out.println("b&c are equal");
        }else {
            System.out.println("none of them are equal");
        }


    }
}
