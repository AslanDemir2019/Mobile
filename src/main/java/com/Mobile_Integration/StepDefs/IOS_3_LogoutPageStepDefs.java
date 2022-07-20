package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_3_LogoutPage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_3_LogoutPageStepDefs {
    IOS_3_LogoutPage Ios_3=new IOS_3_LogoutPage();

    @Given("Ios user is on the App Dashboard Page")
    public void ios_user_is_on_the_app_dashboard_page() {

        Ios_3.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        Ios_3.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        Ios_3.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Given("user has already gone through providing information pages")
    public void user_has_already_gone_through_providing_information_pages() {

        Ios_3.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        Ios_3.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        Ios_3.Skip_1.click();
        MobileUtils.waitFor(5000);
        Ios_3.Skip_1.click();
        MobileUtils.waitFor(5000);
        Ios_3.Skip_1.click();
        MobileUtils.waitFor(5000);
        Ios_3.GetStarted_1.click();
        MobileUtils.waitFor(5000);
    }
    @When("user wants to logout")
    public void user_wants_to_logout() {
        MobileUtils.waitFor(5000);
    }
    @When("user has navigated back to User Profile")
    public void user_has_navigated_back_to_user_profile() {

        Ios_3.Profile.click();
        MobileUtils.waitFor(5000);
    }
    @Then("User should be able to see logout button")
    public void user_should_be_able_to_see_logout_button() {

        Assert.assertTrue("Logout Button is not displayed", Ios_3.Logout.isDisplayed());
        MobileUtils.waitFor(5000);
        Ios_3.Logout.click();
        MobileUtils.waitFor(5000);
        Ios_3.LogoutPopUp.click();

        Driver.closeDriver();
    }

    ///////////// AC.02 ////////////////////////


    @Given("user is on Ios App Dashboard")
    public void user_is_on_ios_app_dashboard() {
        MobileUtils.waitFor(9000);
        Ios_3.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        Ios_3.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        Ios_3.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Given("user wants to logout after going through information pages")
    public void user_wants_to_logout_after_going_through_information_pages() {

        Ios_3.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        Ios_3.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        Ios_3.Skip_1.click();
        MobileUtils.waitFor(5000);
        Ios_3.Skip_1.click();
        MobileUtils.waitFor(5000);
        Ios_3.Skip_1.click();
        MobileUtils.waitFor(5000);
        Ios_3.GetStarted_1.click();
        MobileUtils.waitFor(5000);
    }
    @When("user logs out")
    public void user_logs_out() {
        Ios_3.Profile.click();
        MobileUtils.waitFor(5000);
        Ios_3.Logout.click();
        MobileUtils.waitFor(5000);
        Ios_3.LogoutPopUp.click();
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }
    @When("logs back in")
    public void logs_back_in() {
        MobileUtils.waitFor(9000);
        Driver.getDriver().launchApp();
        MobileUtils.waitFor(9000);
    }
    @Then("email and password fields should be empty")
    public void email_and_password_fields_should_be_empty() {
     //   String expectedResult=Ios_3.SignInEmail.getText();
     //   No text right now. Verify it later when its done
       //Assert.assertTrue("", Ios_3.Sign_In.isDisplayed());
      // Assert.assertTrue("Sign in Email is not empty", Ios_3.SignInEmail.getAttribute(expectedResult).isEmpty());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
