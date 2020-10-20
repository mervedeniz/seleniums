package lecture01_webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverManagerPractice {

    public static void main(String[] args) {

        // Option 2) using the external code Webdrivermanager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://trello.com");

        // maximizing the browser windnow size
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        // set the window size to specific dimention
        Dimension iPhoneX = new Dimension(1024, 1366);
        driver.manage().window().setSize(iPhoneX);

        driver.close();    // closes the window that are currently open
        driver.quit();     // closes all the widow and terminates webdriver process

    }
}
