package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchScreen extends ParentScreen {
    public SearchScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private MobileElement inputForSerchText;

    @AndroidFindBy(className = "android.support.v7.widget.RecyclerView")
    private MobileElement searchResults;

    @AndroidFindBy(xpath = " //android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")
    private MobileElement firstSerchResult;

    public void enterSerchReqest(){
        inputForSerchText.setValue("chrome");
        actionsWithElements.isElementPresent(firstSerchResult,3);
        actionsWithElements.clickOnElement(firstSerchResult);
    }
}
