package com.Mobile_Integration.Pages;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class IOS_13_Log_Out_Page extends BasePage{

    @iOSXCUITFindBy(accessibility = "Allow")
    public IOSElement Allow;

    @iOSXCUITFindBy(accessibility = "Sign In")
    public IOSElement Sign_In;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Your email\"])[2]")
    public IOSElement SignInEmail;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Password\"])[2]")
    public IOSElement SignInPassword;

    @iOSXCUITFindBy(accessibility = "button-container")
    public IOSElement GetStarted_1;

    @iOSXCUITFindBy(accessibility = "welcome-kit-received-button-yes")
    public IOSElement WelcomeKitReceivedButtonYes;

    @iOSXCUITFindBy(accessibility = "welcome-kit-received-button-no")
    public IOSElement WelcomeKitReceivedButtonNo;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Skip\"]")
    public IOSElement Skip_1;

    @iOSXCUITFindBy(accessibility = "Profile, tab, 5 of 5")
    public IOSElement Profile;

    //  @iOSXCUITFindBy(xpath = "//*[@text='Profile']")
    @iOSXCUITFindBy(accessibility = "Profile, tab, 3 of 3")
    public IOSElement AssessmentMemberProfile;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")
    public IOSElement Logout;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")
    public IOSElement AssessmentMemberLogout;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Logout\"]")
    public IOSElement LogoutPopUp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Logout\"]")
    public IOSElement AssessmentMemberLogoutPopUp;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Your email\"])[1]")
    public IOSElement ResetPasswordEmail;

    @iOSXCUITFindBy(accessibility = "reset-button")
    public IOSElement ResetPassword;

    @iOSXCUITFindBy(accessibility = "button-container")
    public IOSElement RequestPasswordReset;

    @iOSXCUITFindBy(accessibility = "A reset password email has been sent if the provided email exists in our system")
    public IOSElement PasswordResetEmailHasBeenSent;

    @iOSXCUITFindBy(accessibility = "button-container")
    public IOSElement Back_To_Sign_In;

}
