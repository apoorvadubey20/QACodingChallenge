package test.java;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.java.BuildingsLayover;
import main.java.CheckAvailability;
import main.java.ConfirmService;
import main.java.ExcelFile;
import main.java.Helper;
import main.java.HomePage;
import main.java.MyChromeDriver;
import main.java.PersonalInformation;
import main.java.PickServiceOption;
import main.java.ScheduleAppointment;

/**
 * This is the sign up test class.
 * 
 * @author adubey
 */
public class SignupTest {

    MyChromeDriver chromeDriver = new MyChromeDriver();
    Helper help = new Helper();

    /**
     * This is the data provider method.
     * 
     * @return two dimensional data object
     */
    @DataProvider
    public Object[][] getSignupData() {
        Object[][] data = ExcelFile.getTestData("webpassSheet");
        return data;
    }

    /**
     * This method for the home page functionality.
     */
    public void homePageFunctionality() {
        HomePage homePage = new HomePage();
        homePage.clickSeeAvailabilityMapButton();
    }

    /**
     * This method for the buildings layover functionality.
     * 
     * @param buildingAddress value data sent
     * @throws InterruptedException
     */
    public void buildingsLayoverFunctionality(String buildingAddress) throws InterruptedException {
        BuildingsLayover buildingsLayover = new BuildingsLayover();
        buildingsLayover.sendAddressValue(buildingAddress);
        Thread.sleep(5000);

        buildingsLayover.clickPotentialAddressSection();
        Thread.sleep(5000);

        buildingsLayover.clickSignUpButton();
        Thread.sleep(5000);
    }

    /**
     * This method for the check availability functionality.
     * 
     * @param unitNumber value data sent
     */
    public void checkAvailabilityFunctionality(String unitNumber) {
        CheckAvailability availability = new CheckAvailability();
        availability.sendUnitNumberValue(unitNumber);
        help.clickContinueButton(chromeDriver.driver);
    }

    /**
     * This method for the pick service option functionality.
     * 
     * @throws InterruptedException
     */
    public void pickServiceOptionFunctionality() throws InterruptedException {
        PickServiceOption serviceOptions = new PickServiceOption();
        Thread.sleep(5000);
        serviceOptions.selectFirstOption();
        help.clickContinueButton(chromeDriver.driver);
    }

    /**
     * This method for the confirm service functionality.
     * 
     * @throws InterruptedException
     */
    public void confirmServiceFunctionality() throws InterruptedException {
        ConfirmService confirmService = new ConfirmService();
        Thread.sleep(5000);
        confirmService.selectFirstOption();
        help.clickContinueButton(chromeDriver.driver);
    }

    /**
     * This method for the schedule appointment functionality.
     * 
     * @throws InterruptedException
     */
    public void scheduleAppointmentFunctionality() throws InterruptedException {
        ScheduleAppointment appointment = new ScheduleAppointment();
        Thread.sleep(5000);
        appointment.selectDate();
        Thread.sleep(5000);
        appointment.selectFirstTimeSlot();
        help.clickContinueButton(chromeDriver.driver);
    }

    /**
     * This method for the personal information page functionality.
     * 
     * @param firstName value data sent
     * @param lastName value data sent
     * @param phone value data sent
     * @param altPhone value data sent
     * @param email value data sent
     * @param confirmEmail value data sent
     * @throws InterruptedException
     */
    public void personalInformationPageFunctionality(String firstName, String lastName, String phone, String altPhone, String email, String confirmEmail) throws InterruptedException {
        PersonalInformation personalInfo = new PersonalInformation();
        personalInfo.sendFirstNameValue(firstName);
        personalInfo.sendLastNameValue(lastName);
        personalInfo.sendPhoneValue(phone);
        personalInfo.sendAltPhoneValue(altPhone);
        personalInfo.sendEmailValue(email);
        personalInfo.sendConfirmEmailValue(confirmEmail);
        personalInfo.selectOption("Yelp Review");
        personalInfo.clickPrivacyPolicyCheckbox();
        personalInfo.clickTermsOfServiceCheckbox();
        help.clickContinueButton(chromeDriver.driver);
        Thread.sleep(5000);
    }

    /**
     * This is the sign up test.
     * Verifies the message provided.
     * 
     * @param buildingAddress data provider
     * @param unitNumber data provider
     * @param firstName data provider
     * @param lastName data provider
     * @param phone data provider
     * @param altPhone data provider
     * @param email data provider
     * @param confirmEmail data provider
     * @throws InterruptedException data provider
     */
    @Test(dataProvider = "getSignupData")
    public void testSignup(String buildingAddress, String unitNumber, String firstName, String lastName, String phone, String altPhone, String email, String confirmEmail) throws InterruptedException {
        chromeDriver.chromeDriver();
        homePageFunctionality();
        buildingsLayoverFunctionality(buildingAddress);
        checkAvailabilityFunctionality(unitNumber);
        pickServiceOptionFunctionality();
        confirmServiceFunctionality();
        scheduleAppointmentFunctionality();
        personalInformationPageFunctionality(firstName, lastName, phone, altPhone, email, confirmEmail);

        Assert.assertTrue("Message did not verify", chromeDriver.driver.getPageSource().contains("Looking for business sign up? Call our sales team at 1-800-WEBPASS x 2 or"));
        chromeDriver.closeDriver();
    }
}
