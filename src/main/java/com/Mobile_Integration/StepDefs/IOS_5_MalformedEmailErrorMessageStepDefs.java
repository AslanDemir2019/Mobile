package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_5_MalformedEmailErrorMessagePage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_5_MalformedEmailErrorMessageStepDefs {
    IOS_5_MalformedEmailErrorMessagePage ios_5=new IOS_5_MalformedEmailErrorMessagePage();


    @Given("IOS user is on the Sign In page")
    public void ios_user_is_on_the_sign_in_page() {
        MobileUtils.waitFor(9000);
        MobileUtils.tapByElement(ios_5.Allow);
        MobileUtils.waitFor(3000);
    }
    @When("they have entered an {string} address")
    public void they_have_entered_an_address(String string) {

        ios_5.SignInEmail.sendKeys(string);
        MobileUtils.waitFor(3000);
        ios_5.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_5.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Then("they should see Invalid email address message and they should not be able to continue.")
    public void they_should_see_invalid_email_address_message_and_they_should_not_be_able_to_continue() {

        Assert.assertTrue("", ios_5.InvalidEmailAddressMessage.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
