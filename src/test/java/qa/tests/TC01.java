package qa.tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.Constants;

public class TC01 extends BaseTest {
    @Test
    public void loginToApplicationByEnteringCredentials() {
        HomePageEvents homePageEvents = new HomePageEvents();
        logger.info("Sign in to home page");
        homePageEvents.clickOnLoginButton();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        logger.info("Verifying if login button is displayed on login page");
        loginPageEvents.verifyIfLoginPageIsLoaded();
        logger.info("Entering credentials and logging in.");
        loginPageEvents.enterFieldValues(Constants.loginEmail, Constants.loginPassword);

    }
}
