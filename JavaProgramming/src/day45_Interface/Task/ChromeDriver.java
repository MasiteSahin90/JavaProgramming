package day45_Interface.Task;

public class ChromeDriver extends RemoteWebDriver implements SearchContext {
    public ChromeDriver(String browserName) {
        super(browserName);
    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void findElements(String locator) {

    }
}
