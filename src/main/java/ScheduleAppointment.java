package main.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This is the object class for schedule appointment page.
 * 
 * @author adubey
 */
public class ScheduleAppointment {

    WebDriver driver = MyChromeDriver.driver;
    Helper help = new Helper();

    private static String dateWidgetValue = "div.ui-datepicker-inline";
    private static String firstTimeSlotRadioValue = "input.appointment-time";

    /**
     * This method is to select a data from the data picker widget.
     */
    public void selectDate() {
        List<WebElement> columns = getDateWidget().findElements(By.tagName("td"));
        for (WebElement cell : columns) {
            // Select 20th Date
            if (cell.getText().equals("20")) {
                cell.findElement(By.linkText("20")).click();
                break;
            }
        }
    }

    /**
     * This method is to get the data picker widget.
     * 
     * @return WebElement data picker widget
     */
    public WebElement getDateWidget() {
        return driver.findElement(By.cssSelector(dateWidgetValue));
    }

    /**
     * This method is to select the first time slot.
     */
    public void selectFirstTimeSlot() {
        help.clickElement(getFirstTimeSlot());
    }

    /**
     * This method is to get the first time slot.
     * 
     * @return WebElement first time slot
     */
    public WebElement getFirstTimeSlot() {
        return driver.findElement(By.cssSelector(firstTimeSlotRadioValue));
    }
}
