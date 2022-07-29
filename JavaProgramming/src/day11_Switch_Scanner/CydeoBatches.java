package day11_Switch_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
        /*
        Create a class named Cydeo batches. In Cydeo we have three batch
types: US morning, US evening, EU.
Depending on a batch type (String) print information about the
batch.
If batch type is US morning ==> print "Class times are
10-5 EST. M, T, Th, F."
If batch type is US evening ==> print "Class times are 7-
10 EST. M, T, W, Th, S, S"
If batch type is EU ==> print "Class times are  10-5 EST.
M, T, W, Th, F."
If batch type is invalid, print "Invalid Btach"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
         */
        String batches = "us morning";
        
            switch (batches){
                case "us morning":
                    System.out.println("Class times are \n" +
                            "10-5 EST. M, T, Th, F.");
                    break;
                case "us evening":
                    System.out.println("Class times are 7-\n" +
                            "10 EST. M, T, W, Th, S, S");
                    break;
                case "eu":
                    System.out.println("Class times are  10-5 EST. \n" +
                            "M, T, W, Th, F.");
                    break;
                default:
                    System.out.println("invalid batch");

            }
        }
    }

