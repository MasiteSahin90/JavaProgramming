package day45_Interface.Task;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver driverChrome = new ChromeDriver("Google");
        EdgeDriver driverEdge = new EdgeDriver("Edge");
        FireFoxDriver driverFire = new FireFoxDriver("FireFox");
        SafariDriver driverSafari = new SafariDriver("Safari");
        OperaDriver driverOpera = new OperaDriver("Opera");

        System.out.println(driverChrome);
        System.out.println(driverSafari.getBrowserName());

        driverChrome.findElement("id");



    }
}
