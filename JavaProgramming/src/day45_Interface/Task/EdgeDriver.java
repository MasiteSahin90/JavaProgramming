package day45_Interface.Task;

public class EdgeDriver extends RemoteWebDriver implements SearchContext{


    public EdgeDriver(String browserName) {
        super(browserName);
    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void findElements(String locator) {

    }
}
