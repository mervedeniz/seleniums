package lecture11_waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import lab.UIActoins;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitUntilElementIsVisible {

    public static void main(String[] args) {
        UIActoins i = new UIActoins();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Ajax-Loader/index.html");

        WebElement click_me = driver.findElement(By.cssSelector("span#button1"));
        click_me.click();

        i.waitfor(2);
        driver.quit();
    }
}