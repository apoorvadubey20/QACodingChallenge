package main.java;

import org.openqa.selenium.edge.EdgeDriver;

/**
 * This is Edge WebDriver class
 * 
 * @author adubey
 */
public class MyEdgeDriver {
    private static String baseUrl = "https://webpass.net/san_diego/residential";
    public static EdgeDriver driver;

    /**
     * This method is the edge driver.
     */
    public void edgeDriver() {
        String propertyPath = System.getProperty("user.dir") + "/src/resources/MicrosoftWebDriver";
        System.setProperty("webdriver.edge.driver", propertyPath);
        driver = new EdgeDriver();

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
