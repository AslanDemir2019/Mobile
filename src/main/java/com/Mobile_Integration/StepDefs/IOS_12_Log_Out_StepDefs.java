package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_12_Log_Out_Page;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_12_Log_Out_StepDefs {
    IOS_12_Log_Out_Page ios_12=new IOS_12_Log_Out_Page();

    @Given("Ios user is on the App Dashboard and have signed in")
    public void ios_user_is_on_the_app_dashboard_and_have_signed_in() {
        MobileUtils.waitFor(9000);
        ios_12.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_12.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_12.Sign_In.click();
    }
    @When("user clicks on Profile Nav bar")
    public void user_clicks_on_profile_nav_bar() {
        MobileUtils.waitFor(9000);
        ios_12.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_12.WelcomeKitReceivedButtonNo.click();
        MobileUtils.waitFor(5000);
        ios_12.Profile.click();
    }
    @Then("user should see Log Out button Displayed")
    public void user_should_see_log_out_button_displayed() {
        Assert.assertTrue("LogOut Button is not navigated ", ios_12.Logout.isDisplayed());
//        MobileUtils.waitFor(5000);
        MobileUtils.waitFor(5000);
        ios_12.Logout.click();
        MobileUtils.waitFor(5000);
        ios_12.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //===================================== AC.02 =================================================


    @Given("ios user is on the Profile")
    public void ios_user_is_on_the_profile() {
        MobileUtils.waitFor(9000);
        ios_12.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_12.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_12.Sign_In.click();

        MobileUtils.waitFor(9000);
        ios_12.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_12.WelcomeKitReceivedButtonNo.click();
        MobileUtils.waitFor(5000);
        ios_12.Profile.click();
    }
    @Given("has clicked on Log Out button")
    public void has_clicked_on_log_out_button() {
        MobileUtils.waitFor(5000);
        ios_12.Logout.click();
    }
    @Then("user should successfully logout from the App")
    public void user_should_successfully_logout_from_the_app() {

        MobileUtils.waitFor(5000);
        ios_12.LogoutPopUp.click();

        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
