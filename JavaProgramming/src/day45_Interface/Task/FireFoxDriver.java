package day45_Interface.Task;

public class FireFoxDriver extends RemoteWebDriver implements SearchContext {
    public FireFoxDriver(String browserName) {
        super(browserName);
    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void findElements(String locator) {

    }
}
