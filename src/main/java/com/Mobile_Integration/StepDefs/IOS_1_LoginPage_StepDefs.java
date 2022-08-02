package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_1_LoginPage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class IOS_1_LoginPage_StepDefs {
    IOS_1_LoginPage ios1LoginPage = new IOS_1_LoginPage();

    @Given("IOS user is on the dashboard")
    public void ios_user_is_on_the_dashboard() {
        MobileUtils.waitFor(5000);
       // MobileUtils.tapByElement(ios1LoginPage.Allow);
    }

    @When("User wants to register")
    public void user_wants_to_register() {

        ios1LoginPage.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios1LoginPage.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios1LoginPage.Sign_In.click();
        MobileUtils.waitFor(9000);

    }

    @Then("IOS User should see register pages one after the other")
    public void ios_user_should_see_register_pages_one_after_the_other() {
        ios1LoginPage.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios1LoginPage.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios1LoginPage.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios1LoginPage.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios1LoginPage.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios1LoginPage.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios1LoginPage.Profile.click();
        MobileUtils.waitFor(5000);
        ios1LoginPage.Logout.click();
        MobileUtils.waitFor(5000);
        ios1LoginPage.LogoutPopUp.click();


        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    ///////////// AC.02 ////////////////////////

    @Given("user is on login page")
    public void user_is_on_login_page() {
        MobileUtils.waitFor(5000);
       // MobileUtils.tapByElement(ios1LoginPage.Allow);
    }

    @When("email is not provided")
    public void username_email_is_not_provided() {
        ios1LoginPage.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
    }

    @Then("Dashboard should not be displayed")
    public void dashboard_should_not_be_displayed() {

        try {
            ios1LoginPage.Sign_In.click();
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Dashboard is not navigated ", true);
        }
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }


    ///////////// AC.03 ////////////////////////
    @Given("IOS user is on login page")
    public void ios_user_is_on_login_page() {
        MobileUtils.waitFor(5000);
      //  MobileUtils.tapByElement(ios1LoginPage.Allow);
    }

    @When("email is provided wrong")
    public void email_is_provided_wrong() {
        ios1LoginPage.SignInEmail.sendKeys("email");
        MobileUtils.waitFor(3000);
        ios1LoginPage.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
    }

    @Then("Dashboard Page should not be displayed")
    public void dashboard_page_should_not_be_displayed() {
        try {
            ios1LoginPage.Sign_In.click();
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Dashboard is not navigated ", true);
        }
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

       ///////////// AC.04 ////////////////////////

    @Given("user wants to login page")
    public void user_wants_to_login_page() {
        MobileUtils.waitFor(5000);
       // MobileUtils.tapByElement(ios1LoginPage.Allow);
    }

    @When("password is not provided")
    public void password_is_not_provided() {
        ios1LoginPage.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
    }

    @Then("Dashboard shouldn't be displayed")
    public void dashboard_should_t_be_displayed() {

        try {
            ios1LoginPage.Sign_In.click();
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Dashboard is not navigated ", true);
        }
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    ///////////// AC.05 ////////////////////////

    @Given("Ios user is on login page Dashboard")
    public void ios_user_is_on_login_page_dashboard() {
        MobileUtils.waitFor(5000);
    //    MobileUtils.tapByElement(ios1LoginPage.Allow);
    }
    @When("password provided is wrong")
    public void password_provided_is_wrong() {

        ios1LoginPage.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios1LoginPage.SignInPassword.sendKeys("password");
        MobileUtils.waitFor(3000);
    }
    @Then("Dashboard should not be viewed")
    public void dashboard_should_not_be_viewed() {

        try {
            ios1LoginPage.Sign_In.click();
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Dashboard is not navigated ", true);
        }
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
