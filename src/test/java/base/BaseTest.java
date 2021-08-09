package base;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.EGGameInfoPage;
import pages.SparkPage;
import pages.XBoxGameInfoPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class BaseTest {


    private WebDriver  driver;

    protected static final  String     pathToChromeDriver = "chromedriver.exe";
    protected static final  String     pathToGeckoDriver = "geckodriver.exe";



    protected Logger logger = Logger.getLogger(getClass());
    protected XBoxGameInfoPage xBoxGameInfoPage;
    protected EGGameInfoPage   egGameInfoPage;
    protected SparkPage        sparkPage;

    @Parameterized.Parameter
    public String browser;



    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"chrome"},
                {"firefox"}
        });

    }

    @Before
    public  void setUp(){
        if("chrome".equals(browser)){
            System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
            driver = new ChromeDriver();
            logger.info(browser + "was opened!");
        }else if("firefox".equals((browser))){
            System.setProperty("webdriver.gecko.driver",pathToGeckoDriver);
            driver = new FirefoxDriver();
            logger.info(browser + "was opened!");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        xBoxGameInfoPage = new XBoxGameInfoPage(driver);
        egGameInfoPage   = new EGGameInfoPage(driver);
        sparkPage        = new SparkPage(driver);
    }


    @After
    public  void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
