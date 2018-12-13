package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This is the object class for buildings layover.
 * 
 * @author adubey
 */
public class BuildingsLayover {

    WebDriver driver = MyChromeDriver.driver;
    Helper help = new Helper();

    private static String findAddressFieldValue = "input[placeholder='Find Address']";
    private static String potentialAddressValue = "div.potential-address";
    private static String signUpButtonValue = "button.selected-address-action-button";

    /**
     * This method is to send the address value.
     * 
     * @param addressValue value send to the address field
     */
    public void sendAddressValue(String addressValue) {
        help.sendValueTo(getAddressField(), addressValue);
    }

    /**
     * This method is to get address field.
     * 
     * @return WebElement address field
     */
    public WebElement getAddressField() {
        return driver.findElement(By.cssSelector(findAddressFieldValue));
    }

    /**
     * This method is to click the potential address section.
     */
    public void clickPotentialAddressSection() {
        help.clickElement(getPotentialAddressSection());
    }

    /**
     * This method is to get potential address section.
     * 
     * @return WebElement potential address section
     */
    public WebElement getPotentialAddressSection() {
        return driver.findElement(By.cssSelector(potentialAddressValue));
    }

    /**
     * This method is to click the sign up button.
     */
    public void clickSignUpButton() {
        help.clickElement(getSignUpButton());
    }

    /**
     * This method is to get the sign up button.
     * 
     * @return WebElement sign up button
     */
    public WebElement getSignUpButton() {
        return driver.findElement(By.cssSelector(signUpButtonValue));
    }
}
