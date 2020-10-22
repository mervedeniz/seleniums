package lecture03_element_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListOfElementsPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
        List<WebElement> tableRows = driver.findElements(By.xpath("//td"));
        for(int i = 0; i < tableRows.size(); i++) {
            System.out.println(tableRows.get(i).getText());
        }
        driver.quit();
    }
}
