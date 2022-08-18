package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_11_WithingsMemberOrientationFlowPage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_11_WithingsMemberOrientationFlowStepDefs {
    IOS_11_WithingsMemberOrientationFlowPage ios_11=new IOS_11_WithingsMemberOrientationFlowPage();

    @Given("IOS user Withings Member wants to log in")
    public void ios_user_withings_member_wants_to_log_in() {
        MobileUtils.waitFor(9000);
    }
    @When("Withings Member provide valid credentials")
    public void withings_member_provide_valid_credentials() {
        ios_11.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_11.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_11.Sign_In.click();
    }
    @Then("Withings Member user should be navigated to Have You received Your Welcome Kit Page")
    public void withings_member_user_should_be_navigated_to_have_you_received_your_welcome_kit_page() {
        MobileUtils.waitFor(5000);
        ios_11.GetStarted_1.click();
        MobileUtils.waitFor(5000);

        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_11.WelcomeKitReceivedButtonYes.isDisplayed());
        MobileUtils.waitFor(5000);
        ios_11.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_11.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_11.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_11.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_11.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_11.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_11.Profile.click();
        MobileUtils.waitFor(5000);
        ios_11.Logout.click();
        MobileUtils.waitFor(5000);
        ios_11.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //============================ AC.02 ====================================
    @Given("IOS user Withings Member is on the Have You received Your Welcome Kit Page")
    public void ios_user_withings_member_is_on_the_have_you_received_your_welcome_kit_page() {
        MobileUtils.waitFor(9000);
        ios_11.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_11.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_11.Sign_In.click();
    }

    @And("answers NO to the question")
    public void answersNOToTheQuestion() {
        MobileUtils.waitFor(5000);
        ios_11.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_11.WelcomeKitReceivedButtonNo.click();
    }
    @When("Withings Member wants to complete the Orientation flow")
    public void withings_member_wants_to_complete_the_orientation_flow() {
        MobileUtils.waitFor(5000);
    }
    @Then("Withings Member should see pages displayed one by one")
    public void withings_member_should_see_pages_displayed_one_by_one() {


//        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_11.WelcomeKitReceivedButtonYes.isDisplayed());
//        MobileUtils.waitFor(5000);
//        ios_11.WelcomeKitReceivedButtonYes.click();
//        MobileUtils.waitFor(5000);
//        ios_11.Skip_1.click();
//        MobileUtils.waitFor(5000);
//        ios_11.Skip_1.click();
//        MobileUtils.waitFor(5000);
//        ios_11.Skip_1.click();
//        MobileUtils.waitFor(5000);
//        ios_11.Skip_1.click();
//        MobileUtils.waitFor(5000);
//        ios_11.GetStarted_1.click();
//        MobileUtils.waitFor(5000);
        ios_11.Profile.click();
        MobileUtils.waitFor(5000);
        ios_11.Logout.click();
        MobileUtils.waitFor(5000);
        ios_11.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //============================ AC.03 ====================================
    @Given("IOS user Withings Member is starting the Orientation flow")
    public void ios_user_withings_member_is_starting_the_orientation_flow() {
        MobileUtils.waitFor(9000);
        ios_11.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_11.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_11.Sign_In.click();
    }
    @Given("Withings Member is on the Have You received Your Welcome Kit Page")
    public void withings_member_is_on_the_have_you_received_your_welcome_kit_page() {
        MobileUtils.waitFor(5000);
        ios_11.GetStarted_1.click();

    }
    @When("Withings Member wants to skip all the pages")
    public void withings_member_wants_to_skip_all_the_pages() {
        MobileUtils.waitFor(5000);
    }
    @Then("there should be skip option on all the pages Withings Member views")
    public void there_should_be_skip_option_on_all_the_pages_withings_member_views() {


        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_11.WelcomeKitReceivedButtonYes.isDisplayed());
        MobileUtils.waitFor(5000);
        ios_11.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_11.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_11.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_11.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_11.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_11.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_11.Profile.click();
        MobileUtils.waitFor(5000);
        ios_11.Logout.click();
        MobileUtils.waitFor(5000);
        ios_11.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
