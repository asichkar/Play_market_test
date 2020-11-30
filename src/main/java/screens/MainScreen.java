package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class MainScreen extends ParentScreen {
    public MainScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private MobileElement inputSearchText;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup")
    private MobileElement inputSearch;



    public void checkSearchInputText() {
            Assert.assertEquals(inputSearchText.getText(),"Поиск игр и приложений");
            logger.info("Check placeholder text");
    }

    public void clickOnSearchInput() {
        actionsWithElements.clickOnElement(inputSearch);
    }
}



















////android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView