package lecture06_complex_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Actions/index.html#");

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.cssSelector("div#click-box"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(element)
                .perform();

        Thread.sleep(2000);

        element.click();

        Thread.sleep(3000);
        driver.quit();

    }
}
