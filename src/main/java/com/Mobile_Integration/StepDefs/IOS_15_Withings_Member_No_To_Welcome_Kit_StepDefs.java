package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_15_Withings_Member_No_To_Welcome_Kit_Page;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_15_Withings_Member_No_To_Welcome_Kit_StepDefs {
    IOS_15_Withings_Member_No_To_Welcome_Kit_Page ios_15 = new IOS_15_Withings_Member_No_To_Welcome_Kit_Page();

    @Given("Withings Member wants logging in to the app")
    public void withings_member_wants_logging_in_to_the_app() {
        MobileUtils.waitFor(7000);
    }

    @When("Withing Member provides valid credentials")
    public void withing_member_provides_valid_credentials() {
        ios_15.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_15.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(9000);
        ios_15.Sign_In.click();
    }

    @Then("Withings Member should be navigated to Have You received Your Welcome Kit Screen")
    public void withings_member_should_be_navigated_to_have_you_received_your_welcome_kit_screen() {
        MobileUtils.waitFor(5000);
        ios_15.GetStarted_1.click();
        MobileUtils.waitFor(5000);

        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_15.WelcomeKitReceivedButtonYes.isDisplayed());
        MobileUtils.waitFor(5000);
        ios_15.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_15.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_15.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_15.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_15.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_15.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_15.Profile.click();
        MobileUtils.waitFor(5000);
        ios_15.Logout.click();
        MobileUtils.waitFor(5000);
        ios_15.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }
//=================================== AC.02 =============================================

    @Given("Withings Member is on the DASHBOARD")
    public void withings_member_is_on_the_dashboard() {
        MobileUtils.waitFor(9000);
        ios_15.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_15.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(9000);
        ios_15.Sign_In.click();
    }

    @Given("has answered NO")
    public void has_answered_no() {
        MobileUtils.waitFor(5000);
        ios_15.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_15.WelcomeKitReceivedButtonNo.click();
    }

    @When("the withings Member wants to complete Orientation flow")
    public void the_withings_member_wants_to_complete_orientation_flow() {
        MobileUtils.waitFor(5000);
    }

    @Then("pages should displayed one by one to the member")
    public void pages_should_displayed_one_by_one_to_the_member() {
        ios_15.Profile.click();
        MobileUtils.waitFor(5000);
        ios_15.Logout.click();
        MobileUtils.waitFor(5000);
        ios_15.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //=================================== AC.03 =============================================
    @Given("the Withings Member is starting the flow")
    public void the_withings_member_is_starting_the_flow() {
        MobileUtils.waitFor(9000);
        ios_15.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_15.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_15.Sign_In.click();
    }

    @Given("Withing Member is on Have You received Your Welcome Kit Screen")
    public void withing_member_is_on_have_you_received_your_welcome_kit_screen() {
        MobileUtils.waitFor(9000);
        ios_15.GetStarted_1.click();
    }

    @When("Withings Member wants to skip all the pages one after the other")
    public void withings_member_wants_to_skip_all_the_pages_one_after_the_other() {
        MobileUtils.waitFor(5000);
    }

    @Then("there should be skip option on top right corners to the Member")
    public void there_should_be_skip_option_on_top_right_corners_to_the_member() {

        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_15.WelcomeKitReceivedButtonYes.isDisplayed());
        MobileUtils.waitFor(5000);
        ios_15.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_15.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_15.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_15.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_15.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_15.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_15.Profile.click();
        MobileUtils.waitFor(5000);
        ios_15.Logout.click();
        MobileUtils.waitFor(5000);
        ios_15.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
