package lecture11_waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import lab.UIActoins;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntilElementInvisible {

    public static void main(String[] args) {

        UIActoins i = new UIActoins();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Ajax-Loader/index.html");
        System.out.println("The loader is spinning...and visible...");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        boolean isInvisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div#loader")));

        System.out.println("value of boolean: " + isInvisible);
        System.out.println("The loader is not INVISIBLE and GONE from view");


        driver.quit();
    }
}
