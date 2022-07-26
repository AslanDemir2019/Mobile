package com.Mobile_Integration.Pages;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class IOS_6_ErrorMessageFoeWrongCredentialsPage extends BasePage{

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

    @iOSXCUITFindBy(accessibility = "text-input-error")
    public IOSElement InvalidEmailAddressMessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Skip\"]")
    public IOSElement Skip_1;

    @iOSXCUITFindBy(accessibility = "Profile, tab, 5 of 5")
    public IOSElement Profile;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")
    public IOSElement Logout;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Logout\"]")
    public IOSElement LogoutPopUp;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"text-input-error\"])[1]")
    public IOSElement PleaseEnterYourEmail;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"text-input-error\"])[2]")
    public IOSElement PleaseEnterYourPassword;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Incorrect email or password\"]")
    public IOSElement InvalidEmailOrPassword;

}
