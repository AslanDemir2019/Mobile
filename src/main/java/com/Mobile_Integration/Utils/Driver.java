package com.Mobile_Integration.Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver {
    private static AppiumDriver<MobileElement> driver;
    private static final DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    // private final static String ANDROID_APP_URL = ConfigurationReader.getProperty("android.app.url");
    //  private final static Logger logger = Logger.getLogger(Driver.class);

    private Driver() {
    }

    private static File getFileFromResource(String fileName) throws URISyntaxException {

        ClassLoader classLoader = Driver.class.getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {


            return new File(resource.toURI());
        }

    }
    public static AppiumDriver<MobileElement> getDriver() {
        if (driver == null) {

            String platformProperty = ConfigurationReader.getProperty("platform");
            String[] platforms = platformProperty.split(",");
            for (String platform : platforms) {

                switch (platform) {
                    case "android":

                        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "11.0");
                        //desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.home") + "/app-qa.apk");
                        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/ademir/IdeaProjects/Mobile/src/main/resources/f88781f3-6eec-4943-a7b7-8ac6c2d9021f-c05f0ba8e15e4d92a87835380d1e34cf.apk");
                       // desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
                      //  desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
                        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3");
                        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);
                        try {
                            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "iOS":

                        Path resourceDirectory = Paths.get("src","main","resources", "/reset.app");
                        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

                        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.5");
                      //  desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/ademir/Library/Developer/Xcode/DerivedData/Calibrate-byerqsgztofpendsbcoetipvrhxc/Build/Products/Debug-iphonesimulator/reset.app ");
                        desiredCapabilities.setCapability(MobileCapabilityType.APP, absolutePath);
                        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
                        //desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13 Pro");
                        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//                        desiredCapabilities.setCapability("autoDismissAlerts", true);
                        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);
                        desiredCapabilities.setCapability(IOSMobileCapabilityType.WDA_STARTUP_RETRIES, "5");
                        try {
                            driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        //  logger.error("Driver type is not implemented yet!");
                        throw new RuntimeException("Driver type is not implemented yet!");
                }
            }

        }
        return driver;
    }

    public static void closeDriver ( ) {
        if (driver != null) {
            driver.closeApp();
            driver = null;
        }
    }

}
