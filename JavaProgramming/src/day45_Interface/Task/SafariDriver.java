package day45_Interface.Task;

public class SafariDriver extends RemoteWebDriver implements SearchContext{
    public SafariDriver(String browserName) {
        super(browserName);
    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void findElements(String locator) {

    }
}
