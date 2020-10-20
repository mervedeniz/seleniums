package lecture02_finding_element;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingMultipleElement {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // https://the-internet.herokuapp.com/add_remove_elements/
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().maximize();

        WebElement banner = driver.findElement(By.cssSelector("h3"));
        String bannerText = banner.getText();
        System.out.println("We got>  " + bannerText);

        WebElement addElementButton = driver.findElement(By.xpath("//div[@id='content']//button[.='Add Element']"));
        String buttonText = addElementButton.getText();
        System.out.println("Button Text:  " + buttonText);

        addElementButton.click();
        addElementButton.click();
        addElementButton.click();
        addElementButton.click();
        addElementButton.click();
        addElementButton.click();
        addElementButton.click();
        addElementButton.click();


        List<WebElement> allDeleteButtons = driver.findElements(By.xpath("//div[@id='elements']/button"));
        int numOfButtons = allDeleteButtons.size();

        System.out.println("How many buttons?: " + numOfButtons);

        for (int i = 0; i < allDeleteButtons.size(); i++) {
            pause(1);
            allDeleteButtons.get(i).click();
        }


        driver.quit();
    }

    public static void pause(int second)  {
        try{
            Thread.sleep(second * 1000);
        }catch (InterruptedException e) {
            System.out.println("oh well..guess waiting did not work because it was interrupted by another software");
        }
    }

}
