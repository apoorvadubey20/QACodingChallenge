package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This is the object class for check availability page.
 * 
 * @author adubey
 */
public class CheckAvailability {

    WebDriver driver = MyChromeDriver.driver;
    Helper help = new Helper();

    private static String unitNumberFieldValue = "unit";

    /**
     * This method is to send the unit number value.
     * 
     * @param unitNumberValue value sent to the unit number filed
     */
    public void sendUnitNumberValue(String unitNumberValue) {
        help.sendValueTo(getUnitNumberField(), unitNumberValue);
    }

    /**
     * This method is to get the unit number field.
     * 
     * @return WebElement unit number field
     */
    public WebElement getUnitNumberField() {
        return driver.findElement(By.id(unitNumberFieldValue));
    }
}
