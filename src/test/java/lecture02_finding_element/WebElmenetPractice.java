package lecture02_finding_element;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElmenetPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.cssSelector("input#first-name"));

        // sendKeys()
        firstNameInput.sendKeys("Nijat afdsfasdfasdfasd f va!@#$%");
        pause(2);

        // clear()
        firstNameInput.clear();

        // click()
        firstNameInput.click();

        // isDisplayed():  true-> element is visible to the user
        boolean isVisibleToHuman = firstNameInput.isDisplayed();
        System.out.println("Visibility: " + isVisibleToHuman);

        // isEnabled():    true-> element is intractable by user, false if element is disabled
        boolean isIntractable = firstNameInput.isEnabled();
        System.out.println("User can use it: " + isIntractable);

        // isSelected():   true-> if element is selected, false if element is not selected
        WebElement highSchoolRadioBttn = driver.findElement(By.id("radio-button-1"));
        highSchoolRadioBttn.click();
        pause(10);

        boolean isChosen = highSchoolRadioBttn.isSelected();

        if(isChosen == false) {
            System.out.println("User did not selecte it, so lets make sure by selecting it..");
        }
        else if(isChosen == true) {
            System.out.println("This is already selected, so do nothing, and move on...");
        }


    }

    public static void pause(int second ) {
        try{
            Thread.sleep(second * 1000);
        }catch (Exception e){

        }
    }


}//end:class

