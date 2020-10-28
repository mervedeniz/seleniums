package lecture06_complex_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Actions/index.html#");
        driver.manage().window().maximize();

        Thread.sleep(4000);



        WebElement target = driver.findElement(By.cssSelector("div:nth-of-type(1) > .dropbtn"));
        WebElement link1 = driver.findElement(By.cssSelector("div:nth-of-type(1) > .dropdown-content > .list-alert"));

        Actions actions = new Actions(driver);
        actions.moveToElement(target)
                .click(link1)
                .perform();

        Thread.sleep(4000);
        driver.quit();
    }


}
