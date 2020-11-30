package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import libs.ActionsWithElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

abstract public class ParentScreen {
    AppiumDriver driver;
    Logger logger = Logger.getLogger(getClass());
    ActionsWithElements actionsWithElements;

    public ParentScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver,5, TimeUnit.SECONDS), this);
        actionsWithElements = new ActionsWithElements(driver);
    }
}
