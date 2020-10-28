package lecture06_complex_interaction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/infinite_scroll");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 350);", "");

        for(int i = 0; i < 10; i++) {

            js.executeScript("window.scrollBy(0, 350);", "");
            Thread.sleep(1000);
        }


        driver.quit();
    }
}
