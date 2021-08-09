package web;

import base.BaseTest;
import enums.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import pages.SparkPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class SparkTest extends BaseTest {

    @Test
    public void checkPage(){
        sparkPage.openWebSite(PageInfo.SPARK_URL.getInfo());
        sparkPage.clickOnDocsButton();
        sparkPage.checkIfTextCompares(PageInfo.MAIN_TEXT.getInfo());
        sparkPage.checkIfTitleCompares(PageInfo.TITLE_TEXT.getInfo());
        System.out.println(browser);
    }
}
