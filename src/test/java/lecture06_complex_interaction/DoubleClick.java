package lecture06_complex_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.DriverManager;

public class DoubleClick {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://webdriveruniversity.com/Actions/index.html#");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement yelloButton = driver.findElement(By.cssSelector("div#double-click > h2"));
        Actions actions = new Actions(driver);
        actions.doubleClick(yelloButton);
        actions.perform();

        Thread.sleep(5000);

        driver.quit();


    }
}
