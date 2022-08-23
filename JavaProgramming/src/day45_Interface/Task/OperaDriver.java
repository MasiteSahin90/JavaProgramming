package day45_Interface.Task;

public class OperaDriver extends RemoteWebDriver implements SearchContext {
    public OperaDriver(String browserName) {
        super(browserName);
    }

}
