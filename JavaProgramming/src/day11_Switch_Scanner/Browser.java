package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        /*
         Create a class called Browser. Write a program that can display the name of selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name
Ex:
	        	String browser = "chrome";
Output:
	    		Chrome Browser is selected

			Note: MUST use nested if
         */

        String browserName = "chrome";
        switch (browserName) {
            case "chrome":
                System.out.println("chrome browser is selected");
                break;
            case "firefox":
                System.out.println("firefox browser is selected");
                break;
            case "safari":
                System.out.println("safari browser is selected");
                break;
            case "opera":
                System.out.println("opera browser is selected");
                break;
            case "edge":
                System.out.println("edge browser is selected");
                break;
            default:
                System.out.println("invalid browser");
        }

                System.out.println("----------------------------------");


                        int num = 2;

                String result =(num == 1)? "one":(num == 2)? "two" :(num==3)?"three":(num==4)? "four":(num==5)?"five"
                        :(num==6)?"six":(num==7)?"seven":(num==8)?"eight":(num==9)?"nine" : "invalid";
                System.out.println("result = " + result);


                     int num2 = 2;

        String result1 =   ( num2 == 1)? "one":(num2==2)? "two":(num2==3)? "three" :(num2== 4)? "four":(num2==5)? "five":(num2==6)? "six"
                :(num2==7)? "seven" :(num2==8)? "eight" :(num2==9)? "nine" : "invalid";

        System.out.println("result = " + result1);



        }




    }

