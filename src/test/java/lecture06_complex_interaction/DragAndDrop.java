package lecture06_complex_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        pause(2);
        Actions action = new Actions(driver);
        pause(2);
        action.dragAndDrop(from, to).build().perform();
        pause(2);
        driver.quit();
    }

    public static void pause(int second ) {
        try{
            Thread.sleep(second * 1000);
        }catch (Exception e){

        }
    }
}
