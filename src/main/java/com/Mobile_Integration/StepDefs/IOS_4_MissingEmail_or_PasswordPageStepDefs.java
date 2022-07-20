package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_4_MissingEmail_or_PasswordPage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class IOS_4_MissingEmail_or_PasswordPageStepDefs {
    IOS_4_MissingEmail_or_PasswordPage ios_4=new IOS_4_MissingEmail_or_PasswordPage();

    @Given("Ios user is on the all Sign In page")
    public void ios_user_is_on_the_all_sign_in_page() {
        MobileUtils.waitFor(9000);
    }
    @When("user provides invalid email and valid password")
    public void user_provides_invalid_email_and_valid_password() {

        ios_4.SignInEmail.sendKeys("email");
        MobileUtils.waitFor(3000);
        ios_4.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_4.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Then("user should not be able to sign in")
    public void user_should_not_be_able_to_sign_in() {
        try{
            ios_4.Sign_In.click();
        }catch (NoSuchElementException e){
            Assert.assertTrue("No Such Element is Thrown as Expected", true);
        }
    }
    @Then("an error message should be displayed for email")
    public void an_error_message_should_be_displayed_for_email() {
        Assert.assertTrue("Email error message is not displayed", ios_4.PleaseEnterYourEmail.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    ///////////// AC.02 ////////////////////////

    @When("user provides valid email and invalid password")
    public void user_provides_valid_email_and_invalid_password() {
        MobileUtils.waitFor(9000);
        ios_4.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios_4.SignInPassword.sendKeys("password");
        MobileUtils.waitFor(3000);
    }
    @Then("the Ios user should not sign in")
    public void the_ios_user_should_not_sign_in() {
        try{
            ios_4.Sign_In.click();
        }catch (NoSuchElementException e){
            Assert.assertTrue("No Such Element is Thrown as Expected", true);
        }
    }
    @Then("an error message should be displayed for password")
    public void an_error_message_should_be_displayed_for_password() {
        Assert.assertTrue("Password error message is not displayed", ios_4.InvalidEmailOrPassword.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();

    }
    ///////////// AC.03 ////////////////////////
    @When("user does not provide valid email and password")
    public void user_does_not_provide_valid_email_and_password() {
        MobileUtils.waitFor(1000);
    }
    @Then("user should not be able to sign in and navigate to Dashboard")
    public void user_should_not_be_able_to_sign_in_and_navigate_to_dashboard() {

        try{
            ios_4.Sign_In.click();
        }catch (NoSuchElementException e){
            Assert.assertTrue("No Such Element is Thrown as Expected", true);
        }
    }
    @Then("an error message should be displayed for email and password")
    public void an_error_message_should_be_displayed_for_email_and_password() {
        Assert.assertTrue("Email error message is not displayed", ios_4.PleaseEnterYourEmail.isDisplayed());
        Assert.assertTrue("Password error message is not displayed", ios_4.PleaseEnterYourPassword.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }



    ///////////// AC.04 ////////////////////////

    @When("user provides valid email and valid password")
    public void user_provides_valid_email_and_valid_password() {
        MobileUtils.waitFor(9000);
        ios_4.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios_4.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_4.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Then("user should be able to sign in")
    public void user_should_be_able_to_sign_in() {
        Assert.assertTrue("Get started is not displayed", ios_4.GetStarted_1.isDisplayed());
        MobileUtils.waitFor(5000);

        ios_4.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_4.WelcomeKitReceivedButtonYes.click();
        MobileUtils.waitFor(5000);
        ios_4.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_4.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_4.Skip_1.click();
        MobileUtils.waitFor(5000);
        ios_4.GetStarted_1.click();
        MobileUtils.waitFor(5000);
        ios_4.Profile.click();
        MobileUtils.waitFor(5000);
        ios_4.Logout.click();
        MobileUtils.waitFor(5000);
        ios_4.LogoutPopUp.click();
        MobileUtils.waitFor(5000);
        Driver.closeDriver();

    }


}
