package com.Mobile_Integration.Pages;

import com.Mobile_Integration.Utils.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    // private final static Logger logger = Logger.getLogger(BasePage.class);
    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

}
