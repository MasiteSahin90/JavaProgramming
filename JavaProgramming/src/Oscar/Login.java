package Oscar;

public class Login {

    public static void main(String[] args) {

        Credentials c = new Credentials();

        System.out.println("user.email = " + c.email);

        System.out.println("user.userName = " + c.getUserName("oscar@cydeo.com"));

        System.out.println("user password = " + c.getPassword("oscar@cydeo.com", "Scolfield"));


   c.setPassword("masite123");

        System.out.println("password after change" + c.getPassword("oscar@cydeo.com","Scolfield"));



    }



}
