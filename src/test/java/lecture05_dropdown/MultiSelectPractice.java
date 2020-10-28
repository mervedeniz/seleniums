package lecture05_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectPractice {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown = driver.findElement(By.id("cars"));
        Select select = new Select(dropdown);
        System.out.println(select.isMultiple());

        if(select.isMultiple()) {
            List<WebElement> allOptions = select.getOptions();
            for(WebElement element:  allOptions) {
                System.out.println(element.getText());
            }

            pause(2);
            select.selectByVisibleText("Volvo");
            pause(2);
            select.selectByVisibleText("Audi");

            List<WebElement> allSelected = select.getAllSelectedOptions();
            System.out.println("User has selected following options:");
            for(WebElement element : allSelected) {
                System.out.println(element.getText());
            }

            pause(2);
            select.deselectByVisibleText("Volvo");
            pause(2);
            select.deselectByVisibleText("Audi");
        }

        driver.quit();
    }

    public static void pause(int second ) {
        try{
            Thread.sleep(second * 1000);
        }catch (Exception e){

        }
    }

}
