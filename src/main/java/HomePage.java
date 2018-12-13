package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This is the object class for home page.
 * 
 * @author adubey
 */
public class HomePage {

    WebDriver driver = MyChromeDriver.driver;
    Helper help = new Helper();

    private static String seeAvailabilityMapValue = "button.button-cta-alt";

    /**
     * This method is to click the see availability on map button.
     */
    public void clickSeeAvailabilityMapButton() {
        help.clickElement(getSeeAvailabilityMapButton());
    }

    /**
     * This method is to get the see availability on map button.
     * 
     * @return WebElement see availability on map button
     */
    public WebElement getSeeAvailabilityMapButton() {
        return driver.findElement(By.cssSelector(seeAvailabilityMapValue));
    }
}
