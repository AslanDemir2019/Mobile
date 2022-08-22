package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_13_Log_Out_Page;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_13_Log_Out_StepDefs {
    IOS_13_Log_Out_Page ios_13=new IOS_13_Log_Out_Page();

    @Given("Ios user is on Dashboard and have signed in")
    public void ios_user_is_on_dashboard_and_have_signed_in() {
        MobileUtils.waitFor(9000);
        ios_13.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_13.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_13.Sign_In.click();
    }
    @When("user clicks on the Profile Navigation bar")
    public void user_clicks_on_the_profile_navigation_bar() {
        MobileUtils.waitFor(9000);
        ios_13.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_13.WelcomeKitReceivedButtonNo.click();
        MobileUtils.waitFor(5000);
        ios_13.Profile.click();
    }
    @Then("Log Out button should be Displayed")
    public void log_out_button_should_be_displayed() {
        Assert.assertTrue("LogOut Button is not navigated ", ios_13.Logout.isDisplayed());
//        MobileUtils.waitFor(5000);
        MobileUtils.waitFor(5000);
        ios_13.Logout.click();
        MobileUtils.waitFor(5000);
        ios_13.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }
    
    //=============================AC.02==================


    @Given("an IOS user is on the Profile Screen")
    public void an_ios_user_is_on_the_profile_screen() {
        MobileUtils.waitFor(9000);
        ios_13.SignInEmail.sendKeys(ConfigurationReader.getProperty("email_Withings"));
        MobileUtils.waitFor(3000);
        ios_13.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_13.Sign_In.click();

        MobileUtils.waitFor(9000);
        ios_13.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_13.WelcomeKitReceivedButtonNo.click();
        MobileUtils.waitFor(5000);
        ios_13.Profile.click();
    }
    @Given("user has clicked on Log Out btn")
    public void user_has_clicked_on_log_out_btn() {
        MobileUtils.waitFor(5000);
        ios_13.Logout.click();
    }
    @Then("user should  logout from the App successfully")
    public void user_should_logout_from_the_app_successfully() {

        MobileUtils.waitFor(5000);
        ios_13.LogoutPopUp.click();

        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }


}
