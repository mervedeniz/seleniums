package lecture03_element_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ElementInteractionPractice {

    public static void main(String[] args) {

        // 1. Set-up the chrome driver using webdrivermanager class
        WebDriverManager.edgedriver().setup();

        // 2. Create driver object
        WebDriver driver = new EdgeDriver();

        // 3. You need visit trello.com
        driver.get("https://trello.com");

        // 4. Grab all the image element in the site as List<WebELement> images
        List<WebElement> imgList = driver.findElements(By.xpath("//img"));

        // 5. Sysout the number of images in the site
        System.out.println( "This site contains this many images : " +  imgList.size() );



    }
}
