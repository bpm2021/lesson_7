package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.core.Is.is;

public class XBoxGameInfoPage extends MainPage{

    public XBoxGameInfoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="search")
    private WebElement serachButton;

    @FindBy(id ="cli_shellHeaderSearchInput")
    private WebElement inputField;

    @FindBy(xpath = "//a[normalize-space()='Fallout 76 | Xbox']")
    private WebElement itemElement;

    @FindBy(xpath = "//h1")
    private WebElement nameOfGame;

    public void openWebSite(String URL){openURL(URL);}

    public void clickOnSearchButton(){
       webDriverMethods.clickOnTheButton(serachButton);
    }

    public void insertTestToTheField(String text){
        webDriverMethods.inputDateToTheField(inputField,text);
    }

    public void clickOnItem(){
        webDriverMethods.clickOnTheButton(itemElement);
    }

    public void checkIfTitleCompares(String title){
        Assert.assertThat(title, is(webDriverMethods.getWebSiteTitle()));
    }

    public void checkIfTextCompares(String text){
        Assert.assertThat(text, is(webDriverMethods.getTextOfElement(nameOfGame)));
    }
}
