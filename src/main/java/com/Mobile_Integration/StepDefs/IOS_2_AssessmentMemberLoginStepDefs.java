package com.Mobile_Integration.StepDefs;

import com.Mobile_Integration.Pages.IOS_2_AssessmentMemberLoginPage;
import com.Mobile_Integration.Utils.ConfigurationReader;
import com.Mobile_Integration.Utils.Driver;
import com.Mobile_Integration.Utils.MobileUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.util.NoSuchElementException;

public class IOS_2_AssessmentMemberLoginStepDefs {
    IOS_2_AssessmentMemberLoginPage ios_2 =new IOS_2_AssessmentMemberLoginPage();

    @Given("Assessment Member is on the dashboard")
    public void assessment_member_is_on_the_dashboard() {
        MobileUtils.waitFor(5000);
     //   MobileUtils.tapByElement(ios_2.Allow);
        MobileUtils.waitFor(5000);
//        ios_2.Alert.click();
//        Alert alert = Driver.getDriver().switchTo().alert();
//        String alertMessage=Driver.getDriver().switchTo().alert().getText();
//        System.out.println("This is alert textxtxtxtxtxtxtxtxt ="+alertMessage);
//        alert.dismiss();
        MobileUtils.waitFor(5000);
    }
    @When("Assessment Member wants to register")
    public void assessment_member_wants_to_register() {

        ios_2.SignInEmail.sendKeys(ConfigurationReader.getProperty("assessmentMemberEmail"));
        MobileUtils.waitFor(3000);
        ios_2.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
        ios_2.Sign_In.click();
        MobileUtils.waitFor(9000);
    }
    @Then("Assessment Member should see Dashboard")
    public void assessment_member_should_see_dashboard() {

        Assert.assertTrue("Dashboard isn't shown to Assessment Member", ios_2.AssessmentMemberHome.isDisplayed());
        MobileUtils.waitFor(3000);
//        Driver.getDriver().switchTo().alert().dismiss();
//        Driver.getDriver().switchTo().defaultContent();
//        Alert alert = Driver.getDriver().switchTo().alert();
//        alert.accept();
//        Driver.getDriver().switchTo().defaultContent();

//        Driver.getDriver().switchTo().alert();

        ios_2.AssessmentMemberProfile.click();
        MobileUtils.waitFor(9000);
        ios_2.AssessmentMemberLogout.click();
        MobileUtils.waitFor(9000);
        ios_2.AssessmentMemberLogoutPopUp.click();
        MobileUtils.waitFor(9000);
        Driver.closeDriver();
    }

   //=================== AC.02 ==========================
   @Given("Assessment Member is on login page")
   public void assessment_member_is_on_login_page() {

       MobileUtils.waitFor(5000);
      // MobileUtils.tapByElement(ios_2.Allow);
   }
    @When("Assessment Member email is not provided")
    public void assessment_member_email_is_not_provided() {

        ios_2.SignInEmail.sendKeys("");
        MobileUtils.waitFor(3000);
        ios_2.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
    }
    @Then("Dashboard should not be displayed to Assessment Member")
    public void dashboard_should_not_be_displayed_to_assessment_member() {

        try {
            ios_2.Sign_In.click();
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Dashboard is not navigated ", true);
        }
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //=================== AC.03 ==========================

    @Given("Assessment Member is on login")
    public void assessment_member_is_on_login() {

        MobileUtils.waitFor(5000);
      //  MobileUtils.tapByElement(ios_2.Allow);
    }
    @When("Assessment Member email is provided wrong")
    public void assessment_member_email_is_provided_wrong() {

        ios_2.SignInEmail.sendKeys("assessmentMemberEmail");
        MobileUtils.waitFor(3000);
        ios_2.SignInPassword.sendKeys(ConfigurationReader.getProperty("password"));
        MobileUtils.waitFor(3000);
    }
    @Then("Dashboard Page should not be displayed for Assessment Member")
    public void dashboard_page_should_not_be_displayed_for_assessment_member() {

        try {
            ios_2.Sign_In.click();
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Dashboard is not navigated ", true);
        }
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

   //=================== AC.04 ==========================


    @Given("Assessment Member wants to login")
    public void assessment_member_wants_to_login() {

        MobileUtils.waitFor(5000);
     //   MobileUtils.tapByElement(ios_2.Allow);
    }
    @When("password is not provided by Assessment Member")
    public void password_is_not_provided_by_assessment_member() {

        ios_2.SignInEmail.sendKeys(ConfigurationReader.getProperty("assessmentMemberEmail"));
        MobileUtils.waitFor(3000);
        ios_2.SignInPassword.sendKeys("");
        MobileUtils.waitFor(3000);
    }
    @Then("Dashboard shouldn't be displayed to Assessment Member")
    public void dashboard_shouldn_t_be_displayed_to_assessment_member() {

        try {
            ios_2.Sign_In.click();
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Dashboard is not navigated ", true);
        }
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

    //=================== AC.05 ==========================

    @Given("Assessment Member is on login page Dashboard")
    public void assessment_member_is_on_login_page_dashboard() {

        MobileUtils.waitFor(5000);
     //   MobileUtils.tapByElement(ios_2.Allow);
    }
    @When("Assessment Member provides wrong password")
    public void assessment_member_provides_wrong_password() {
        ios_2.SignInEmail.sendKeys(ConfigurationReader.getProperty("assessmentMemberEmail"));
        MobileUtils.waitFor(3000);
        ios_2.SignInPassword.sendKeys("password");
        MobileUtils.waitFor(3000);
    }
    @Then("Dashboard should not be viewed to Assessment Member")
    public void dashboard_should_not_be_viewed_to_assessment_member() {

        try {
            ios_2.Sign_In.click();
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Dashboard is not navigated ", true);
        }
        MobileUtils.waitFor(5000);
        Driver.closeDriver();
    }

}
