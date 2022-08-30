package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_8_HaveYouReceivedWelcomeKit_NOPage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_8_HaveYouReceivedWelcomeKit_NOStepDefs {
    IOS_8_HaveYouReceivedWelcomeKit_NOPage ios_8=new IOS_8_HaveYouReceivedWelcomeKit_NOPage();

    @Given("ios user logs into the App")
    public void ios_user_logs_into_the_app() {
        MobileUtils.waitFor(9000);
    }

    @Given("clicks on Get Started button")
    public void clicks_on_get_started_button() {
        ios_8.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios_8.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_8.Sign_In.click();
        MobileUtils.waitFor(12000);
    }

    @When("user clicks on Yes for Have You received your Welcome Kit")
    public void user_clicks_on_yes_for_have_you_received_your_welcome_kit() {
        
        ios_8.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_8.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);

    }

    @Then("user should be able to complete the Orientation Flow")
    public void user_should_be_able_to_complete_the_orientation_flow() {

        ios_8.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_8.Skip_1.click();
//        MobileUtils.waitFor(5000);
//        ios_8.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_8.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_8.Profile.click();
        MobileUtils.waitFor(5000);
        ios_8.Logout.click();
        MobileUtils.waitFor(5000);
        ios_8.LogoutPopUp.click();
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //====================== AC.02 ===============================

    @Given("IOS user has loged in")
    public void ios_user_has_loged_in() {

        ios_8.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios_8.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_8.Sign_In.click();
        MobileUtils.waitFor(12000);
    }

    @Given("clicked on The Get Started Button")
    public void clicked_on_the_get_started_button() {

        ios_8.GetStarted_1.click();
        MobileUtils.waitFor(5000);

    }
    @When("user clicks on No option for Have You received your Welcome Kit")
    public void user_clicks_on_no_option_for_have_you_received_your_welcome_kit() {
        ios_8.WelcomeKitReceivedButtonNo.click();
        MobileUtils.waitFor(5000);
    }
    @Then("Your program hasn't started yet should be displayed")
    public void yourProgramHasnTStartedYetShouldBeDisplayed() {
        Assert.assertTrue("Your program has not started yet is not displayed", ios_8.Today.isDisplayed());
        MobileUtils.waitFor(5000);
        ios_8.Profile.click();
        MobileUtils.waitFor(5000);
        ios_8.Logout.click();
        MobileUtils.waitFor(5000);
        ios_8.LogoutPopUp.click();
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }
}
