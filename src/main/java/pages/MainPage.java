package pages;


import lib.WebDriverMethods;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private   WebDriver driver;
    protected Logger    logger = Logger.getLogger(getClass());
    protected WebDriverMethods webDriverMethods;

    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        webDriverMethods = new  WebDriverMethods(driver);
    }

    /**
     * Method openURL
     * @param URL
     */

    protected void openURL(String URL){
        try{
            driver.get(URL);
            logger.info("Successful opened URL!");
        }catch (Exception e){
            logger.info("Enable to open URL!");
            logger.info(e);
            Assert.fail("Enable to open URL!");
        }
    }
}
