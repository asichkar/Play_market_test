package screens;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;


public class ResultScreen extends ParentScreen  {
    public ResultScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Button")
    private MobileElement buttonOpen;


    public void checkButtonOpen() {
            actionsWithElements.isElementPresent(buttonOpen,5);
            Assert.assertEquals(buttonOpen.getText(),"Открыть" );
            logger.info("Check button text");
        }
}
