package lab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.List;


public class UIActoins {

    // Fileds
    private WebDriver driver;


    // ================ BROWSER RELATED =============== //

    public WebDriver getDriver() {
        if (driver == null) {
            throw new NullPointerException("Please start the driver");
        }
        return driver;
    }


    /**
     * Prepares chrome browser by instantiating chromedriver object
     */
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    /**
     * Opens specified browser by the user, the list of supported browser are
     * as follows:  [ firefox, edge, opera, ie, chorme ]
     *
     * @param browserName String
     */
    public void openBrowser(String browserName) {
        if (browserName.toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.toLowerCase().equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.toLowerCase().equals("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        } else if (browserName.toLowerCase().equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    }

    /**
     * Quits the browser and closes all browser windows
     */
    public void quitBrowser() {
        driver.quit();
    }


    /**
     * Set the browser window size to specified dimention
     *
     * @param width int
     * @param hight int
     */
    public void setWindowSize(int width, int hight) {
        Dimension size = new Dimension(width, hight);
        driver.manage().window().setSize(size);
    }

    /**
     * Set the browser window size to full-screen
     */
    public void fullScreen() {
        driver.manage().window().fullscreen();
    }

    /**
     * Set the browser window size for screen-size
     */
    public void maximize() {
        driver.manage().window().maximize();
    }


    /**
     * Goes to the specified website by given URL
     *
     * @param url String
     */
    public void goTo(String url) {
        driver.get(url);
    }


    // ================ TIME RELATED =============== //

    /**
     * Waits the thread for specified seconds
     *
     * @param second int
     */
    public void waitfor(int second) {
        int miliseconds = second * 1000;
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException ex) {
            System.out.println("Waiting has failed");
        }
    }


    // ================ ELEMENT RELATED =============== //

    /**
     * Clicks the element specified by locator
     *
     * @param locator By
     */
    public void click(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }


    /**
     * Returns the inner text of element specified by locator
     *
     * @return
     */
    public String getText(By locator) {
        WebElement element = driver.findElement(locator);
        String text = element.getText();
        return text;
    }


    /**
     * Returns WebElement object from the specified locator
     *
     * @param locator
     * @return
     */
    public WebElement asWebElement(By locator) {
        WebElement element = driver.findElement(locator);
        return element;
    }

    /**
     * Returns list of WebElement from the specified locator
     *
     * @param locator
     * @return
     */
    public List<WebElement> asListOfElements(By locator) {
        return driver.findElements(locator);
    }


    public void write(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    public void clear(By locator) {
        WebElement element = driver.findElement(locator);
        element.clear();
    }
}



