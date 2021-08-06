package lib;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class WebDriverMethods {

    private WebDriver driver;
    public WebDriverMethods(WebDriver driver){
        this.driver = driver;
    }

    private Logger logger = Logger.getLogger(getClass());

    /**
     * Method clickOnTheButton
     * @param buttonElement
     * */

    public void clickOnTheButton(WebElement buttonElement){
        try{
            buttonElement.click();
            logger.info("Successful clicked on the button!");
        }catch (Exception e){
            logger.info("Enable to click on the button!");
            logger.info(e);
            Assert.fail("Enable to click on the button!");
        }
    }

    /***
     * Method inputDateToTheField
     * @param fieldElement
     * @param textElement
     */

    public void inputDateToTheField(WebElement fieldElement, String textElement){
        try{
            fieldElement.sendKeys(textElement);
            logger.info("Successful input to the field" + textElement);
        }catch (Exception e){
            logger.info("Enable to input to the field");
            logger.info(e);
            Assert.fail("Enable to input to the field");
        }
    }

    /**
     * Method getWebSiteTitle
     * @return title
     */

    public String getWebSiteTitle(){
        String title = null;
        try{
            title = driver.getTitle();
            logger.info("page title is " + title);
        }catch (Exception e){
            logger.info("Enable to take a Title");
            logger.info(e);
            Assert.fail("Enable to take a Title");
        }
        return title;
    }

    /**
     * Method getTextOfElement
     * @param pageElement
     * @return text
     */

    public String getTextOfElement(WebElement pageElement){
        String text = null;
        try{
            text = pageElement.getText();
            logger.info("page title is " + text);
        }catch (Exception e){
            logger.info("Enable to take a Title");
            logger.info(e);
            Assert.fail("Enable to take a Title");
        }
        return text;
    }

}
