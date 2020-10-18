package lecture01_webdriver;

public class DetectingSystem {

    public static void main(String[] args) {

        // 1. detecting the operating system
        String osName = System.getProperty("os.name");
        System.out.println(osName);

        if(osName.contains("Windows")) {
            // do something
            System.out.println("here it is Bill Gates");
        }
        else if(osName.contains("Mac") ) {
            // do something
            System.out.println("here it is Steve Jobs");
        }

        // 2.Detecting root path of our project
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);


        // 3. Full path of the Driver software
        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
        System.out.println("Full path of driver software:  " + driverPath);

    }
}
