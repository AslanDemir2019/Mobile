package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_10_BoxoutMemberOrientationFlowPage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_10_BoxoutMemberOrientationFlowStepDefs {
    IOS_10_BoxoutMemberOrientationFlowPage ios_10=new IOS_10_BoxoutMemberOrientationFlowPage();

    @Given("IOS user BoxOut Member wants to log in")
    public void ios_user_box_out_member_wants_to_log_in() {
        MobileUtils.waitFor(9000);
    }
    @When("BoxOut Member provide valid credentials")
    public void box_out_member_provide_valid_credentials() {
        ios_10.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Boxout"));
        MobileUtils.waitFor(3000);
        ios_10.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_10.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Then("BoxOut Member user should be navigated to Have You received Your Welcome Kit Page")
    public void box_out_member_user_should_be_navigated_to_have_you_received_your_welcome_kit_page() {

        ios_10.GetStarted_1.click();
        MobileUtils.waitFor(5000);

        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_10.WelcomeKitReceivedButtonYes.isDisplayed());
        MobileUtils.waitFor(5000);
        ios_10.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Profile.click();
        MobileUtils.waitFor(5000);
        ios_10.Logout.click();
        MobileUtils.waitFor(5000);
        ios_10.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //============================ AC.02 ===========================================

    @Given("IOS user BoxOut Member is on the Have You received Your Welcome Kit Page")
    public void ios_user_box_out_member_is_on_the_have_you_received_your_welcome_kit_page() {
        MobileUtils.waitFor(9000);
        ios_10.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Boxout"));
        MobileUtils.waitFor(3000);
        ios_10.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_10.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @When("BoxOut Member wants to complete the Orientation flow")
    public void box_out_member_wants_to_complete_the_orientation_flow() {
        MobileUtils.waitFor(5000);
    }
    @Then("BoxOut Member should see pages displayed one by one")
    public void box_out_member_should_see_pages_displayed_one_by_one() {

        ios_10.GetStarted_1.click();
        MobileUtils.waitFor(5000);

//        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_10.WelcomeKitReceivedButtonYes.isDisplayed());
//        MobileUtils.waitFor(5000);
        ios_10.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Profile.click();
        MobileUtils.waitFor(5000);
        ios_10.Logout.click();
        MobileUtils.waitFor(5000);
        ios_10.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //============================ AC.03 ===========================================

    @Given("IOS user BoxOut Member is starting the Orientation flow")
    public void ios_user_box_out_member_is_starting_the_orientation_flow() {
        MobileUtils.waitFor(9000);
        ios_10.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Boxout"));
        MobileUtils.waitFor(3000);
        ios_10.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_10.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Given("BoxOut Member is on the Have You received Your Welcome Kit Page")
    public void box_out_member_is_on_the_have_you_received_your_welcome_kit_page() {
        ios_10.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_10.WelcomeKitReceivedButtonYes.click();
    }
    @When("BoxOut Member wants to skip all the pages")
    public void box_out_member_wants_to_skip_all_the_pages() {
        MobileUtils.waitFor(5000);
    }
    @Then("there should be skip option on all the pages BoxOut Member views")
    public void there_should_be_skip_option_on_all_the_pages_box_out_member_views() {
//
//        ios_10.GetStarted_1.click();
//        MobileUtils.waitFor(5000);
//
//        Assert.assertTrue("Have You received Your Welcome Kit Page is not navigated ", ios_10.WelcomeKitReceivedButtonYes.isDisplayed());
//        MobileUtils.waitFor(5000);
//        ios_10.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_10.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_10.Profile.click();
        MobileUtils.waitFor(5000);
        ios_10.Logout.click();
        MobileUtils.waitFor(5000);
        ios_10.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
