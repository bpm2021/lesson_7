package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.core.Is.is;

public class SparkPage extends MainPage{

    public SparkPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Docs']")
    private WebElement docsButton;

    @FindBy(xpath = "//h1")
    private WebElement topicText;

    public void openWebSite(String URL){openURL(URL);}

    public void clickOnDocsButton(){ webDriverMethods.clickOnTheButton(docsButton); }

    public void checkIfTitleCompares(String title){ Assert.assertThat(title, is(webDriverMethods.getWebSiteTitle())); }

    public void checkIfTextCompares(String text){ Assert.assertThat(text, is(webDriverMethods.getTextOfElement(topicText))); }
}
