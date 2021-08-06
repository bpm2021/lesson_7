package web;

import base.BaseTest;
import enums.GameInfo;
import org.junit.Test;

public class SuccessfulEGGameInfoTest extends BaseTest {
    @Test
    public void checkPage(){
        egGameInfoPage.openWebSite(GameInfo.EG_URL.getInfo());
        egGameInfoPage.insertTextToTheField(GameInfo.EG_CORRECT_GAME_NAME.getInfo());
        egGameInfoPage.clickOnSubmitButton();
        egGameInfoPage.clickOnGameButton();
        egGameInfoPage.clickOnContinueButton();
        egGameInfoPage.checkIfTextCompares(GameInfo.CORRECT_PUBLISHER_NAME.getInfo());
    }
}
