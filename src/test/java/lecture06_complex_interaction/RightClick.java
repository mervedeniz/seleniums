package lecture06_complex_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class RightClick {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.cssSelector(".context-menu-one"));

        Actions actions = new Actions(driver);
        actions.contextClick(element);
        actions.perform();

        Thread.sleep(3000);

        WebElement cut = driver.findElement(By.cssSelector(".context-menu-icon-cut"));
        cut.click();

        Thread.sleep(3000);

        driver.quit();




    }
}
