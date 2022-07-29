package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("masite" , "sahin");

        System.out.println("-------------------------------");

        domain("cydeo@cydeoschool.com");

        System.out.println("-------------------------------");

        String[] emails = {"masite@hotmail.com" , "sahin.reaha@gmail.com", "sacidesahin@yahoo.com"};

        for (String each : emails) {
            domain(each);


        }

        System.out.println("-------------------------------");

        nameOfTheMonths(7);
    }

    public static void initials(String firstname , String lastname){
        System.out.println(firstname.toUpperCase().charAt(0)+ "." + lastname.toUpperCase().charAt(0));


    }

    public static void domain(String email){

        String domain = email.substring(email.indexOf("@") + 1 , email.lastIndexOf("."));
        System.out.println(domain);

    }

    public static void nameOfTheMonths(int number){
        String name = "";

        if(number >=1 && number<=12){
            name = (number==1)?"january" :(number==2)? "february":(number==3)? "march":(number==4)? "april":(number==5)? "may"
                    :(number==6)? "june":(number==7)? "july":(number==8)? "august":(number==9)? "september":(number==10)? "october"
                    :(number==11)? "november" :(number==12)? "december" : "invalid";
         }
        System.out.println(name);

    }



}
