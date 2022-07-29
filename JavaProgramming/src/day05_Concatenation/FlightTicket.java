package day05_Concatenation;

public class FlightTicket {

    /*
   create a class named FlightTicket, and declare the following
variables:
1. from
2. to
3. ticketPrice
use concatenation to display the full info of the ticket
ex:
From Las Vegas to McLean is $425.5
     */

    public static void main(String[] args) {
        String from = "London";
        String to = "Izmir";
        double ticketPrice = 84.5;

        String ticket = "From " + from + " to " + to + " is " + ticketPrice + "$";

        System.out.println(ticket);
    }
}
