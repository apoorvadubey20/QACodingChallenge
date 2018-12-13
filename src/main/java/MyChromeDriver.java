package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is the Chrome WebDriver class
 * 
 * @author adubey
 */
public class MyChromeDriver {
    private static String baseUrl = "https://webpass.net/san_diego/residential";
    public static WebDriver driver;

    /**
     * This method is the chrome driver.
     */
    public void chromeDriver() {
        String propertyPath = System.getProperty("user.dir") + "/src/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", propertyPath);
        driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    /**
     * This is the close driver method.
     */
    public void closeDriver() {
        driver.close();
    }
}
