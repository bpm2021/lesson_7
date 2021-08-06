package base;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EGGameInfoPage;
import pages.XBoxGameInfoPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    protected static        WebDriver  driver;
    protected static final  String     pathToChromeDriver = "chromedriver.exe";

    protected Logger           logger = Logger.getLogger(getClass());


    protected XBoxGameInfoPage xBoxGameInfoPage = new XBoxGameInfoPage(driver);
    protected EGGameInfoPage   egGameInfoPage   = new EGGameInfoPage(driver);

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    @Before
    public  void startTest(){
        System.out.println("Test was started!");
    }

    @After
    public  void endTest(){
        System.out.println("Test was ended!");
    }
}
