package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://online.citi.com/US/login.do") String url){
        System.setProperty("webdriver.gecko.driver", "/Users/hasan/IdeaProjects/projectSelenium1/Driver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        //driver.findElement(By.className("shopNow__label")).click();


    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }
}
