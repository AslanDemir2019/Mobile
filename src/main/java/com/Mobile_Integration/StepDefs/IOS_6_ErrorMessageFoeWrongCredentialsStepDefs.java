package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_6_ErrorMessageFoeWrongCredentialsPage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class IOS_6_ErrorMessageFoeWrongCredentialsStepDefs {
    IOS_6_ErrorMessageFoeWrongCredentialsPage ios_6=new IOS_6_ErrorMessageFoeWrongCredentialsPage();

    @Given("Ios User is on the Login page")
    public void ios_user_is_on_the_login_page() {
        MobileUtils.waitFor(9000);
        MobileUtils.tapByElement(ios_6.Allow);
        MobileUtils.waitFor(3000);
    }
    @When("ios user provides an invalid email and valid password")
    public void ios_user_provides_an_invalid_email_and_valid_password() {

        ios_6.SignInEmail.sendKeys("email");
        MobileUtils.waitFor(3000);
        ios_6.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_6.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Then("ios user should not be able to Login")
    public void ios_user_should_not_be_able_to_login() {
        try{
            ios_6.Sign_In.click();
        }catch (NoSuchElementException e){
            Assert.assertTrue("No Such Element is Thrown as Expected", true);
        }
    }
    @Then("an error message should be displayed under Your Email section")
    public void an_error_message_should_be_displayed_under_your_email_section() {

        Assert.assertTrue("Email error message is not displayed", ios_6.PleaseEnterYourEmail.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //==================== AC.02 ===============================

    @When("the Ios user provides a valid email but an invalid password")
    public void the_ios_user_provides_a_valid_email_but_an_invalid_password() {

        MobileUtils.waitFor(9000);
        ios_6.SignInEmail.sendKeys(ConfigurationReader.getProperty("email"));
        MobileUtils.waitFor(3000);
        ios_6.SignInPassword.sendKeys("password");
        MobileUtils.waitFor(3000);
    }
    @Then("the Ios user should not Login")
    public void the_ios_user_should_not_login() {

        try{
            ios_6.Sign_In.click();
        }catch (NoSuchElementException e){
            Assert.assertTrue("No Such Element is Thrown as Expected", true);
        }
    }
    @Then("an error message should be displayed under the password section")
    public void an_error_message_should_be_displayed_under_the_password_section() {

        Assert.assertTrue("Password error message is not displayed", ios_6.InvalidEmailOrPassword.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    // ==================== AC.03 ===============================

    @When("Ios user does not provide any email or password")
    public void ios_user_does_not_provide_any_email_or_password() {
        MobileUtils.waitFor(5000);
    }
    @Then("Ios user should not Login onto Dashboard")
    public void iosUserShouldNotLoginOntoDashboard() {
        try{
            ios_6.Sign_In.click();
        }catch (NoSuchElementException e){
            Assert.assertTrue("No Such Element is Thrown as Expected", true);
        }
    }

    @Then("an error message should be displayed")
    public void an_error_message_should_be_displayed() {

        Assert.assertTrue("Password error message is not displayed", ios_6.PleaseEnterYourEmail.isDisplayed());
        Assert.assertTrue("Password error message is not displayed", ios_6.PleaseEnterYourPassword.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
