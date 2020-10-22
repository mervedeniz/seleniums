package lecture03_element_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListOfElementPractice4 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        // WOMEN
        WebElement womensButton = driver.findElement(By.linkText("WOMEN"));
        womensButton.click();
        pause(5);

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Number of checkboxes: " + checkBoxes.size());

//        for (int i = 0; i < checkBoxes.size(); i++) {
//            pause(1);
//            checkBoxes.get(i).click();
//        }

        // for-each
        // read-only
        for (WebElement eachElement : checkBoxes) {
            pause(1);
            eachElement.click();
        }


        driver.quit();

    }

    public static void pause(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            System.out.println("Oh man.cpu intteruppted us");
        }
    }

}
