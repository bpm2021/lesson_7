package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.core.Is.is;

public class EGGameInfoPage extends MainPage{

    public EGGameInfoPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input")
    private WebElement inputField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//ul/li[2]/div/div/a[@role='link']")
    private WebElement gameButton;

    @FindBy(xpath = "//span[contains(.,'Continue')]/parent::button")
    private WebElement continueButton;

    @FindBy(xpath = "//span[normalize-space()='Ubisoft']")
    private WebElement textElement;

    public void openWebSite(String URL){openURL(URL);}

    public void insertTextToTheField(String text){
        webDriverMethods.inputDateToTheField(inputField,text);
    }

    public void clickOnSubmitButton(){
        webDriverMethods.clickOnTheButton(submitButton);
    }

    public void clickOnGameButton(){
        webDriverMethods.clickOnTheButton(gameButton);
    }

    public void clickOnContinueButton(){ webDriverMethods.clickOnTheButton(continueButton); }

    public void checkIfTextCompares(String text){ Assert.assertThat(text, is(webDriverMethods.getTextOfElement(textElement))); }
}
