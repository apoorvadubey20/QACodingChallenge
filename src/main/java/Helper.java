package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This is the helper class having common code.
 * 
 * @author adubey
 */
public class Helper {

    private static String continueButtonValue = "button.continue";

    /**
     * This method is to click the desired WebElement.
     * 
     * @param element which is to be clicked
     */
    public void clickElement(WebElement element) {
        element.click();
    }

    /**
     * This method is to send the value to the WebElement.
     * 
     * @param element where the value is to be sent
     * @param value desired value
     */
    public void sendValueTo(WebElement element, String value) {
        element.sendKeys(value.toString());
    }

    /**
     * This method is to click the continue button which is common on all the pages.
     * 
     * @param driver WebDriver
     */
    public void clickContinueButton(WebDriver driver) {
        clickElement(getContinueButton(driver));
    }

    /**
     * This method is to get the continue button which is common on all the pages.
     * 
     * @param driver WebDriver
     * @return WebElement continue button
     */
    public WebElement getContinueButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(continueButtonValue));
    }
}
