package lecture11_waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import lab.UIActoins;
import lab.UiActionsVerification;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntilAttributeValueContains {

    public static void main(String[] args) {
        UIActoins i = new UIActoins();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://todomvc.com/examples/backbone/");
        i.waitfor(3);
        WebElement todoInput = driver.findElement(By.cssSelector(".new-todo"));
        todoInput.sendKeys("Practice coding");
        i.waitfor(1);
        todoInput.sendKeys(Keys.ENTER);

        WebElement first_list_item = driver.findElement(By.xpath("//ul[@class='todo-list']/li"));
        System.out.println(first_list_item.getAttribute("class"));

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.attributeContains(By.xpath("//ul[@class='todo-list']/li"), "class", "completed"));

        WebElement firt_item_check = driver.findElement(By.xpath("//ul[@class='todo-list']//input[@type='checkbox']"));
        firt_item_check.click();

        WebElement second_time = driver.findElement(By.xpath("//ul[@class='todo-list']/li"));
        System.out.println(second_time.getAttribute("class"));

        driver.quit();
    }
}
