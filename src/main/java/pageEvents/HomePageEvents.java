package pageEvents;

import base.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.fasterxml.jackson.databind.ser.Serializers;
import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {

    ElementFetch elementFetch = new ElementFetch();
    ExtentTest logger = BaseTest.logger;
    public void clickOnLoginButton() {
        logger.info("clickOnLoginButton() -> entering method");
        logger.info("Clicking on Login button on home page.");
        elementFetch.getWebElement("XPATH", HomePageElements.loginBtn).click();
        logger.info("clickOnLoginButton() -> exiting method");
    }
}
