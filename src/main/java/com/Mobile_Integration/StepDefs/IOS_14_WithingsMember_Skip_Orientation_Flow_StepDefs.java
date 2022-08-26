package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_14_WithingsMember_Skip_Orientation_Flow_Page;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_14_WithingsMember_Skip_Orientation_Flow_StepDefs {
    IOS_14_WithingsMember_Skip_Orientation_Flow_Page ios_14=new IOS_14_WithingsMember_Skip_Orientation_Flow_Page();

    @Given("Withings Member wants to log in")
    public void withings_member_wants_to_log_in() {
        MobileUtils.waitFor(3000);

    }
    @When("Member provide valid credentials")
    public void member_provide_valid_credentials() {
        ios_14.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_14.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_14.Sign_In.click();
    }
    @Then("Member user should be navigated to Have You received Your Welcome Kit Screen")
    public void member_user_should_be_navigated_to_have_you_received_your_welcome_kit_screen() {
        MobileUtils.waitFor(5000);
        ios_14.GetStarted_1.click();
        MobileUtils.waitFor(5000);

        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_14.WelcomeKitReceivedButtonYes.isDisplayed());
        MobileUtils.waitFor(5000);
        ios_14.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_14.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_14.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_14.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_14.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_14.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_14.Profile.click();
        MobileUtils.waitFor(5000);
        ios_14.Logout.click();
        MobileUtils.waitFor(5000);
        ios_14.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //================================ AC.02 ==========================================

    @Given("Withings Member is on the Have You received Your Welcome Kit question")
    public void withings_member_is_on_the_have_you_received_your_welcome_kit_question() {
        MobileUtils.waitFor(9000);
        ios_14.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_14.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_14.Sign_In.click();
    }
    @Given("answers NO")
    public void answers_no() {
        MobileUtils.waitFor(5000);
        ios_14.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_14.WelcomeKitReceivedButtonNo.click();
    }
    @When("Member wants to complete Orientation flow still")
    public void member_wants_to_complete_orientation_flow_still() {
        MobileUtils.waitFor(5000);
       
    }
    @Then("pages should displayed")
    public void pages_should_displayed() {
        ios_14.Profile.click();
        MobileUtils.waitFor(5000);
        ios_14.Logout.click();
        MobileUtils.waitFor(5000);
        ios_14.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //================================ AC.03 ==========================================

    @Given("Withings Member is starting the Orientation flow")
    public void withings_member_is_starting_the_orientation_flow() {
        MobileUtils.waitFor(9000);
        ios_14.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_14.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_14.Sign_In.click();
    }
    @Given("Member is on Have You received Your Welcome Kit Page")
    public void member_is_on_have_you_received_your_welcome_kit_page() {
        MobileUtils.waitFor(5000);
        ios_14.GetStarted_1.click();
    }
    @When("Withings Member wants to skip all the screens to the END")
    public void withings_member_wants_to_skip_all_the_screens_to_the_end() {
        MobileUtils.waitFor(5000);
    }
    @Then("there should be skip option on top right corners of all the pages")
    public void there_should_be_skip_option_on_top_right_corners_of_all_the_pages() {

        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_14.WelcomeKitReceivedButtonYes.isDisplayed());
        MobileUtils.waitFor(5000);
        ios_14.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_14.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_14.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_14.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_14.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_14.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_14.Profile.click();
        MobileUtils.waitFor(5000);
        ios_14.Logout.click();
        MobileUtils.waitFor(5000);
        ios_14.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }


}
