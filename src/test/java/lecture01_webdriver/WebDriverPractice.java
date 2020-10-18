package lecture01_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPractice {

    public static void main(String[] args) {

        // Lets connect Selenium Code with WebDriver
        // Option 1)  using the driver software executable path
        String systemOs = System.getProperty("os.name");
        if(systemOs.contains("Windows")) {
            String driverFullPath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
            // Connecting selenium-java with chrome driver software
            System.setProperty("webdriver.chrome.driver", driverFullPath);
        }
        else if(systemOs.contains("Mac")) {
            String driverFullPath = System.getProperty("user.dir") + "/drivers/chromedriver";
            System.setProperty("webdriver.chrome.driver", driverFullPath);
        }

        // We are ready to write any selenium-java and that will
        // take effect on installed Chrome browser
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://trello.com");


    }

}
