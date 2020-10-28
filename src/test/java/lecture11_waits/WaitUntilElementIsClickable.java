package lecture11_waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import lab.UIActoins;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntilElementIsClickable {

    public static void main(String[] args) {
        UIActoins i = new UIActoins();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Ajax-Loader/index.html");

        // WebDriver ---> WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement click_me = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span#button1 > p")));
        click_me.click();

        i.waitfor(5);
        driver.quit();
    }
}
