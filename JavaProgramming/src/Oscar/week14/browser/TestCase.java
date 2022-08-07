package Oscar.week14.browser;

public class TestCase {

    Browser browser;
    OS operatingSystem;

    @Override
    public String toString() {
        return "TestCase{" +
                "browser=" + browser.getBrowserType() +
                ", operatingSystem=" + operatingSystem.getOS() +
                '}';
    }
}
