package lecture05_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownIntro {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
        Select selectDropdown = new Select(dropdown);
        List<WebElement> options = selectDropdown.getOptions();

        for(int i = 0; i < options.size(); i++) {
            String optionText = options.get(i).getText();
            System.out.println(optionText);
        }

        System.out.println("can we select multiple element at the same time? " + selectDropdown.isMultiple());
        pause(3);
        selectDropdown.selectByIndex(0);
        pause(3);
        selectDropdown.selectByValue("7");  // Voilet
        pause(3);
        selectDropdown.selectByVisibleText("Aqua");
        pause(3);


        driver.quit();
    }


    public static void pause(int second ) {
        try{
            Thread.sleep(second * 1000);
        }catch (Exception e){

        }
    }

}
