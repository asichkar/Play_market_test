package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import screens.MainScreen;
import screens.ResultScreen;
import screens.SearchScreen;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverBase {

    AppiumDriver driver;
    protected MainScreen mainScreen;
    protected SearchScreen searchScreen;
    protected ResultScreen resultScreen;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "UEEDU18927000337");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.android.vending");
        desiredCapabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        desiredCapabilities.setCapability("noReset", false);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        mainScreen = new MainScreen(driver);
        searchScreen = new SearchScreen(driver);
        resultScreen = new ResultScreen(driver);
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
























