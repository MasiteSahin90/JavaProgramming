package day45_Interface.Task;

public class RemoteWebDriver implements WebDriver,TakeScreenShot, JavaScriptExecuter {

    private final String browserName;

    public RemoteWebDriver(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }

    @Override
    public void executeScript(String script) {

    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void findElements(String locator) {

    }

    @Override
    public void takeScreenShot() {

    }

    @Override
    public void get(String url) {

    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public void getTitle() {

    }
}
