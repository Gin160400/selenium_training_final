import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class tcsLevel01 {
    WebDriver driver;

    private HomePageObject homePage;
    private RegisterPageObject registerPage;
    private MyAccountPageObject myAccountPage;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //getURL(driver,"");
        homePage = new HomePageObject();
    }

    @Test
    public void TC_01_Login(){
        homePage.clickToRegisterLink();

        registerPage = new RegisterPageObject();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
