package lecture06_complex_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://webdriveruniversity.com/Actions/index.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement from = driver.findElement(By.cssSelector("div#draggable  b"));
        WebElement target = driver.findElement(By.cssSelector("#droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(from,target);
        actions.perform();


        Thread.sleep(5000);

        driver.quit();
    }

}
