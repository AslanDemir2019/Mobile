package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_7_ResetPasswordPage;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IOS_7_ResetPasswordStepDefs {
    IOS_7_ResetPasswordPage ios_7 =new IOS_7_ResetPasswordPage();

    @Given("Ios user is on the Login page Dashboard")
    public void ios_user_is_on_the_login_page_dashboard() {
        MobileUtils.waitFor(9000);
    }

    @When("user has forgotten the password")
    public void user_has_forgotten_the_password() {
        MobileUtils.waitFor(1000);

    }

    @Then("user should see a Reset Password option")
    public void user_should_see_a_reset_password_option() {
        Assert.assertTrue("Reset Password is not displayed", ios_7.ResetPassword.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //==================== AC.02 ==========================

    @When("user wants to reset password")
    public void user_wants_to_reset_password() {
        MobileUtils.waitFor(1000);
    }
    @When("clicks Reset Password option")
    public void clicks_reset_password_option() {
        ios_7.ResetPassword.click();
    }
    @Then("user should be navigated to Reset Password Email Page")
    public void user_should_be_navigated_to_reset_password_email_page() {
        Assert.assertTrue("Reset Password Email is not displayed", ios_7.ResetPasswordEmail.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //==================== AC.03 ==========================
    @When("user wants to reset his her password")
    public void user_wants_to_reset_his_her_password() {
        MobileUtils.waitFor(1000);
    }
    @When("clicks on the Reset Password")
    public void clicks_on_the_reset_password() {
        ios_7.ResetPassword.click();
    }
    @Then("user should go to Reset Password Email Page")
    public void user_should_go_to_reset_password_email_page() {
        ios_7.ResetPasswordEmail.isDisplayed();
    }
    @When("the Ios user provides a valid email")
    public void the_ios_user_provides_a_valid_email() {

        ios_7.ResetPasswordEmail.sendKeys("LeoMessi@gmail.com");
    }
    @When("clicks on Request Password Reset option")
    public void clicks_on_request_password_reset_option() {
        ios_7.RequestPasswordReset.click();
    }

    @Then("Email sent notification should be displayed")
    public void emailSentNotificationShouldBeDisplayed() {

        Assert.assertTrue("reset Password Email Been Sent is not displayed", ios_7.PasswordResetEmailHasBeenSent.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //==================== AC.04 ==========================

    @When("user provides an email for resetting")
    public void userProvidesAnEmailForResetting() {
        ios_7.ResetPassword.click();
        MobileUtils.waitFor(3000);
        ios_7.ResetPasswordEmail.sendKeys("LeoMessi@gmail.com");
        MobileUtils.waitFor(3000);
        ios_7.RequestPasswordReset.click();
    }

    @Then("Back To Sign In Button should be displayed")
    public void backToSignInButtonShouldBeDisplayed() {
        Assert.assertTrue("Back to sign in Page is not displayed", ios_7.Back_To_Sign_In.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //==================== AC.05 ==========================
    @When("user provides a valid email to reset password")
    public void userProvidesAValidEmailToResetPassword() {
        ios_7.ResetPassword.click();
        MobileUtils.waitFor(5000);
    }

    @And("clicks on Back to sign in page option")
    public void clicksOnBackToSignInPageOption() {
        ios_7.ResetPasswordEmail.sendKeys("LeoMessi@gmail.com");
        MobileUtils.waitFor(3000);
        ios_7.RequestPasswordReset.click();
        MobileUtils.waitFor(5000);
        ios_7.Back_To_Sign_In.click();
    }
    @Then("user should be navigated to Calibrate Sign In Page Dashboard")
    public void userShouldBeNavigatedToCalibrateSignInPageDashboard() {
        Assert.assertTrue("SignIn Dashboard is not displayed", ios_7.SignInEmail.isDisplayed());
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //==================== AC.06 ==========================
}
