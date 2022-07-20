package com.Mobile_Integration.Pages;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
public class IOS_1_LoginPage extends BasePage{

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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Skip\"]")
    public IOSElement Skip_1;

    @iOSXCUITFindBy(accessibility = "Profile, tab, 5 of 5")
    public IOSElement Profile;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")
    public IOSElement Logout;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Logout\"]")
    public IOSElement LogoutPopUp;

}
