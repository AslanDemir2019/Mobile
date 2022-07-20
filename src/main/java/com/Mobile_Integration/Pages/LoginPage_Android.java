package com.Mobile_Integration.Pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage_Android extends BasePage{
//    @AndroidFindBy(accessibility = "Register")
//    public AndroidElement Register;

    @AndroidFindBy(xpath = "//*[@text='Your email']")
    public AndroidElement SignInEmail;

    @AndroidFindBy(xpath = "//*[@text='Password']")
    public AndroidElement SignInPassword;

    @AndroidFindBy(xpath = "//*[@text='Sign In']")
    public AndroidElement SignInSignIn;

    @AndroidFindBy(xpath = "//*[@text='Calibrate']")
    public AndroidElement Calibrate;

    @AndroidFindBy(xpath = "//*[@text='Get Started']")
    public AndroidElement GetStarted;

    @AndroidFindBy(xpath = "//*[@text='Yes']")
    public AndroidElement Yes;

    @AndroidFindBy(xpath = "//*[@text='Enter measurement']")
    public AndroidElement EnterMeasurement;

    @AndroidFindBy(xpath = "//*[@text='Save & Continue']")
    public AndroidElement SaveAndContinue;

    @AndroidFindBy(xpath = "//*[@text='Skip']")
    public AndroidElement Skip;

    @AndroidFindBy(xpath = "//*[@text='Allow Access']")
    public AndroidElement AllowAccess;

    @AndroidFindBy(xpath = "//*[@text='Get Started']")
    public AndroidElement Get_Started_2;

    @AndroidFindBy(xpath = "//*[@text='Profile']")
    public AndroidElement Profile;

    @AndroidFindBy(xpath = "//*[@text='Logout']")
    public AndroidElement Logout;

    @AndroidFindBy(xpath = "//*[@text='LOGOUT']")
    public AndroidElement Logout2;

}
