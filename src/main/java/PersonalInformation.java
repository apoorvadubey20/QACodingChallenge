package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * This is the object class for personal information page.
 * 
 * @author adubey
 */
public class PersonalInformation {

    WebDriver driver = MyChromeDriver.driver;
    Helper help = new Helper();

    private static String firstNameFieldValue = "first-name";
    private static String lastNameFieldValue = "last-name";
    private static String phoneNumberFieldValue = "phone";
    private static String altPhoneNumberFieldValue = "alt-phone";
    private static String emailFieldValue = "email";
    private static String confirmEmailFieldValue = "email-confirm";
    private static String hearAboutUsDdValue = "referral-id";
    private static String privacyPolicyCheckboxValue = "privacy-policy";
    private static String termsOfServiceCheckboxValue = "tos";

    /**
     * This method is to send the first name value.
     * 
     * @param firstName value sent to first name field
     */
    public void sendFirstNameValue(String firstName) {
        help.sendValueTo(getFirstNameField(), firstName);
    }

    /**
     * This method is to get the first name field.
     * 
     * @return WebElement first name field
     */
    public WebElement getFirstNameField() {
        return driver.findElement(By.id(firstNameFieldValue));
    }

    /**
     * This method is to send last name value.
     * 
     * @param lastName value sent to the last name field
     */
    public void sendLastNameValue(String lastName) {
        help.sendValueTo(getLastNameField(), lastName);
    }

    /**
     * This method is to get the last name field.
     * 
     * @return WebElement last name field
     */
    public WebElement getLastNameField() {
        return driver.findElement(By.id(lastNameFieldValue));
    }

    /**
     * This method is to send the phone value.
     * 
     * @param phoneNumber value sent to the phone field
     */
    public void sendPhoneValue(String phoneNumber) {
        help.sendValueTo(getPhoneField(), phoneNumber);
    }

    /**
     * This method is to get the phone field.
     * 
     * @return WebElement phone field
     */
    public WebElement getPhoneField() {
        return driver.findElement(By.id(phoneNumberFieldValue));
    }

    /**
     * This method is to send the alt phone value.
     * 
     * @param altPhoneNumber value sent to alt phone field
     */
    public void sendAltPhoneValue(String altPhoneNumber) {
        help.sendValueTo(getAltPhoneField(), altPhoneNumber);
    }

    /**
     * This method is to get the alt phone field.
     * 
     * @return WebElement alt phone field
     */
    public WebElement getAltPhoneField() {
        return driver.findElement(By.id(altPhoneNumberFieldValue));
    }

    /**
     * This method is to send the email value.
     * 
     * @param email value to be sent to email field
     */
    public void sendEmailValue(String email) {
        help.sendValueTo(getEmailField(), email);
    }

    /**
     * This method is to get the email field.
     * 
     * @return WebElement email field
     */
    public WebElement getEmailField() {
        return driver.findElement(By.id(emailFieldValue));
    }

    /**
     * This method is to send the confirmation email value.
     * 
     * @param confirmEmail value to be sent to confirmation email field
     */
    public void sendConfirmEmailValue(String confirmEmail) {
        help.sendValueTo(getConfirmEmailField(), confirmEmail);
    }

    /**
     * This method is to get the confirmation email field.
     * 
     * @return WebElement confirmation email field
     */
    public WebElement getConfirmEmailField() {
        return driver.findElement(By.id(confirmEmailFieldValue));
    }

    /**
     * This method is to select the hear about us drop down.
     * 
     * @param option to be selected from hear about us drop down
     */
    public void selectOption(String option) {
        Select hearAboutUsDd = new Select(driver.findElement(By.id(hearAboutUsDdValue)));
        hearAboutUsDd.selectByVisibleText(option);
    }

    /**
     * This method is to click the privacy policy checkbox.
     */
    public void clickPrivacyPolicyCheckbox() {
        help.clickElement(getPrivacyPolicyCheckbox());
    }

    /**
     * This method is to get the privacy policy checkbox.
     * 
     * @return WebElement privacy policy checkbox
     */
    public WebElement getPrivacyPolicyCheckbox() {
        return driver.findElement(By.id(privacyPolicyCheckboxValue));
    }

    /**
     * This method is to click the terms of service checkbox.
     */
    public void clickTermsOfServiceCheckbox() {
        help.clickElement(getTermsOfServiceCheckbox());
    }

    /**
     * This method is to get the terms of service checkbox.
     * 
     * @return WebElement terms of service checkbox.
     */
    public WebElement getTermsOfServiceCheckbox() {
        return driver.findElement(By.id(termsOfServiceCheckboxValue));
    }
}
