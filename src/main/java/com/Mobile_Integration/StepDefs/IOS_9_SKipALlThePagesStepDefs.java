package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_9_SKipALlThePagesPage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_9_SKipALlThePagesStepDefs {
    IOS_9_SKipALlThePagesPage ios_9 = new IOS_9_SKipALlThePagesPage();

    @Given("IOS user wants to log in")
    public void ios_user_wants_to_log_in() {
        MobileUtils.waitFor(9000);
    }
    @When("user provide valid credentials")
    public void user_provide_valid_credentials() {
        ios_9.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios_9.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_9.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Then("user should be navigated to Have You received Your Welcome Kit Page")
    public void user_should_be_navigated_to_have_you_received_your_welcome_kit_page() {

        ios_9.GetStarted_1.click();
        MobileUtils.waitFor(5000);

        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_9.WelcomeKitReceivedButtonYes.isDisplayed());
        MobileUtils.waitFor(5000);
        ios_9.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_9.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_9.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_9.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_9.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_9.Profile.click();
        MobileUtils.waitFor(5000);
        ios_9.Logout.click();
        MobileUtils.waitFor(5000);
        ios_9.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //======================== AC.02 ==============================
    @Given("IOS user is on the Have You received Your Welcome Kit Page")
    public void ios_user_is_on_the_have_you_received_your_welcome_kit_page() {
        MobileUtils.waitFor(9000);
        ios_9.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios_9.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_9.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @When("user wants to complete the Orientation flow")
    public void user_wants_to_complete_the_orientation_flow() {
        MobileUtils.waitFor(5000);
    }
    @Then("pages should be displayed one by one")
    public void pages_should_be_displayed_one_by_one() {

        ios_9.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_9.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_9.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_9.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_9.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_9.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_9.Profile.click();
        MobileUtils.waitFor(5000);
        ios_9.Logout.click();
        MobileUtils.waitFor(5000);
        ios_9.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //======================== AC.03 ==============================

    @Given("IOS user is starting the Orientation flow")
    public void ios_user_is_starting_the_orientation_flow() {
        MobileUtils.waitFor(9000);
        ios_9.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios_9.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_9.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Given("is on the Have You received Your Welcome Kit Page")
    public void is_on_the_have_you_received_your_welcome_kit_page() {
        ios_9.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_9.WelcomeKitReceivedButtonYes.click();
    }
    @When("user wants to skip all the pages")
    public void user_wants_to_skip_all_the_pages() {
        MobileUtils.waitFor(5000);
    }
    @Then("there should be skip option on all the pages")
    public void there_should_be_skip_option_on_all_the_pages() {
        ios_9.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_9.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_9.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_9.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_9.Profile.click();
        MobileUtils.waitFor(5000);
        ios_9.Logout.click();
        MobileUtils.waitFor(5000);
        ios_9.LogoutPopUp.click();

        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
