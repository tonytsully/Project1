package basedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageclasses.LandingPage;
import pageclasses.ShopPage;
import utilities.Constants;
import utilities.ExcelUtility;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected WebDriver driver;
    private static final String baseUrl = "https://www.disney.com/";
   protected static final int longWait= 15000;
   protected static final int mediumWait = 8000;
   protected static final int shortWait = 2000;


    @BeforeTest
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        getWaitTime(mediumWait);
        ExcelUtility.setExcelFile(
                Constants.File_Path + Constants.File_Name, "Sheet1");

    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }



    public static void getWaitTime(int waitTime) throws InterruptedException {
        Thread.sleep(waitTime);
    }

}
