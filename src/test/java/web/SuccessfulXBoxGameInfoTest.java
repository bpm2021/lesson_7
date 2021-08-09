package web;

import base.BaseTest;
import enums.GameInfo;
import org.junit.Test;

public class SuccessfulXBoxGameInfoTest extends BaseTest {

    @Test
    public void checkPage(){
        xBoxGameInfoPage.openWebSite(GameInfo.XBOX_URL.getInfo());
        xBoxGameInfoPage.clickOnSearchButton();
        xBoxGameInfoPage.insertTestToTheField(GameInfo.CORRECT_GAME_NAME.getInfo());
        xBoxGameInfoPage.clickOnSearchButton();
        xBoxGameInfoPage.clickOnItem();
        xBoxGameInfoPage.checkIfTitleCompares(GameInfo.CORRECT_PAGE_TITLE.getInfo());
        xBoxGameInfoPage.checkIfTextCompares(GameInfo.CORRECT_GAME_NAME.getInfo());
    }
}
