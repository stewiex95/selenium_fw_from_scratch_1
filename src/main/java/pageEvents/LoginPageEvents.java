package pageEvents;

import base.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
    ElementFetch elementFetch = new ElementFetch();
    ExtentTest logger = BaseTest.logger;

    public void verifyIfLoginPageIsLoaded() {
        logger.info("verifyIfLoginPageIsLoaded() -> entering method");
        logger.info("Asserting if login button is displayed.");
        Assert.assertTrue(elementFetch.getWebElement("XPATH", LoginPageElements.loginButton).isDisplayed(),
                "Login button is not displayed, login page is not loaded.");
        logger.info("verifyIfLoginPageIsLoaded() -> exiting method");
    }

    public void enterFieldValues(String emailAddress, String password) {
        logger.info("enterFieldValues() -> entering method");
        logger.info("Entering field values and clicking on Login button.");
        elementFetch.getWebElement("XPATH", LoginPageElements.emailAddressField).sendKeys(emailAddress);
        elementFetch.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys(password);
        elementFetch.getWebElement("XPATH", LoginPageElements.loginButton).click();
        logger.info("enterFieldValues() -> exiting method");
    }

}
