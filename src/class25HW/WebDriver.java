package class25HW;

public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Chrome Element");
    }
}
class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Firefox Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Firefox Element");
    }


    public static void main(String[] args) {

        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver x:webDrivers){
            x.closeBrowser();
            x.openBrowser();
            x.findElement();
            x.maximizeWindow();
        }
    }
}