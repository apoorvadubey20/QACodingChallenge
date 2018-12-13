package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This is the object class for confirm service page.
 * 
 * @author adubey
 */
public class ConfirmService {

    WebDriver driver = MyChromeDriver.driver;
    Helper help = new Helper();

    private static String firstItemRadioValue = "(//input[@name='item'])[1]";

    /**
     * This method is to select the first radio option.
     */
    public void selectFirstOption() {
        help.clickElement(getFirstRadioItem());
    }

    /**
     * This method is to get the first radio option.
     * 
     * @return WebElement first radio option
     */
    public WebElement getFirstRadioItem() {
        return driver.findElement(By.xpath(firstItemRadioValue));
    }
}
