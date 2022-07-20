package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.LoginPage_Android;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginAndroid_StepDefs {
    LoginPage_Android loginPage_android = new LoginPage_Android();

    @Given("Android user navigate to Calibrate Mobile App")
    public void android_user_navigate_to_calibrate_mobile_app() {
        MobileUtils.waitFor(5000);
    }
    @When("User provides valid credentials")
    public void user_provides_valid_credentials() {
   loginPage_android.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
   loginPage_android.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
   loginPage_android.SignInSignIn.click();
    }
    @Then("User should see Home page")
    public void user_should_see_home_page() {

        MobileUtils.waitFor(9000);
        Assert.assertTrue("Calibrate Home Page is Not Navigated", loginPage_android.Calibrate.isDisplayed());
        Driver.closeDriver();
    }

 //   =============================== AC 02 ==================================================


    @Given("Android user is on the dashboard for the first time")
    public void android_user_is_on_the_dashboard_for_the_first_time() {
        MobileUtils.waitFor(5000);
        loginPage_android.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage_android.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage_android.SignInSignIn.click();
        MobileUtils.waitFor(5000);
    }
    @When("User wants to do a setup")
    public void user_wants_to_do_a_setup() {
        MobileUtils.waitFor(5000);
    }
    @Then("User should be able to see the sequence of pages one after the other")
    public void user_should_be_able_to_see_the_sequence_of_pages_one_after_the_other() {
        loginPage_android.GetStarted.click();
        MobileUtils.waitFor(3000);
        loginPage_android.Yes.click();
        MobileUtils.waitFor(3000);
        loginPage_android.Skip.click();
        MobileUtils.waitFor(3000);
        loginPage_android.Skip.click();
//        loginPage_android.EnterMeasurement.click();
//        MobileUtils.waitFor(3000);
//        loginPage_android.SaveAndContinue.click();
//        MobileUtils.waitFor(3000);
//        loginPage_android.Skip.click();
        MobileUtils.waitFor(5000);
        loginPage_android.Get_Started_2.click();
        MobileUtils.waitFor(5000);
        loginPage_android.Profile.click();
        MobileUtils.waitFor(5000);
        loginPage_android.Logout.click();
        MobileUtils.waitFor(5000);
        MobileUtils.tapByElement(loginPage_android.Logout2);
        MobileUtils.waitFor(3000);

        Driver.closeDriver();

    }



}
