package lecture02_finding_element;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementPractice {

    public static void main(String[] args) {

        // 1. Setup the chrome driver
        WebDriverManager.chromedriver().setup();
        // 2. Create a WebDriver object
        WebDriver driver = new ChromeDriver();
        // 3. Go to trello.com
        driver.get("https://trello.com");
        // 4. Maximize the window
        //driver.manage().window().maximize();

        WebElement loginLink = driver.findElement(By.linkText("Log In"));
        String elementText = loginLink.getText();
        String hrefAttrVal = loginLink.getAttribute("href");
        String classAttrVal = loginLink.getAttribute("class");
        String tagName = loginLink.getTagName();
        System.out.println(elementText);
        System.out.println(hrefAttrVal);
        System.out.println(classAttrVal);
        System.out.println(tagName);
    }
}

/*
    WebElement element = driver.findElement(By.id("signup");
    element.clear();
 */





















