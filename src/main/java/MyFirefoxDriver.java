package main.java;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This is Firefox WebDriver class
 * 
 * @author adubey
 */
public class MyFirefoxDriver {
    private static String baseUrl = "https://webpass.net/san_diego/residential";
    public static FirefoxDriver driver;

    /**
     * This method is the firefox driver.
     */
    public void firefoxDriver() {
        String propertyPath = System.getProperty("user.dir") + "/src/resources/geckodriver";
        System.setProperty("webdriver.firefox.marionette", propertyPath);
        driver = new FirefoxDriver();

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
