package playMarket;

import core.DriverBase;
import org.testng.annotations.Test;

public class Demo_Test extends DriverBase {

    @Test
    public void checkButtonOpenForChrome(){
        mainScreen.checkSearchInputText();
        mainScreen.clickOnSearchInput();
        searchScreen.enterSerchReqest();
        resultScreen.checkButtonOpen();
    }
}
