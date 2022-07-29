package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester t1 = new Tester("Masite Sahin" ,11,"QA",110000);
        Tester t2 = new Tester("Reha Sahin" ,12,"SDET",120000);
        Tester t3 = new Tester("Sacide Sahin" ,13,"QA",130000);
        Tester t4 = new Tester("Sena Sahin" ,14,"SDET",140000);

        Tester[] tester = {t2,t3,t4};

        Developer d1 = new Developer("Ahmet" , 22,"Java Developer",125000);
        Developer d2 = new Developer("Ali" , 23,"Java Developer",126000);
        Developer d3 = new Developer("Ayca" , 24,"Java Developer",165000);
        Developer d4 = new Developer("Abdul" , 25,"Java Developer",195000);
        Developer d5 = new Developer("Aliye" , 226,"Java Developer",135000);

        Developer[] developer = {d2,d3,d4};
        ScrumTeam scrum = new ScrumTeam("Masite","Reha","Sacide",14);


        scrum.addTester(t1);
        scrum.addDeveloper(d1);
        scrum.addTesters(tester);
        scrum.addDevelopers(developer);

        System.out.println(scrum);

        System.out.println("-------------------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + ":" + eachTester.salary);
        }

        for (Developer eachDeveloper : scrum.developersList) {
            System.out.println(eachDeveloper.name + ":" + eachDeveloper.salary);
        }

        System.out.println("-------------------------------------");

        scrum.removeDeveloper(24);
        scrum.removeTester(12);

        System.out.println(scrum);









    }
}
