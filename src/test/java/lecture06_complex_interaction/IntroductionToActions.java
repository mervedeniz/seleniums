package lecture06_complex_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IntroductionToActions {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement first = driver.findElement(By.xpath("//div[1]/img[@alt='User Avatar']"));
        Actions actions = new Actions(driver);
        pause(2);
        actions.moveToElement(first).perform();
        pause(2);
        WebElement firstNameText = driver.findElement(By.xpath("//h5[text()='name: user1']"));
        System.out.println(firstNameText.isDisplayed());
        driver.quit();
    }

    public static void pause(int second ) {
        try{
            Thread.sleep(second * 1000);
        }catch (Exception e){

        }
    }
}
