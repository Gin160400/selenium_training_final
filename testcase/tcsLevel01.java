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

    @Test
    public void TC_02_Register(){
        registerPage.genderMaleCheckbox();
        registerPage.firstNameTextbox();
        registerPage.lastNameTextbox();
        registerPage.companyNameTextbox();
        registerPage.passwordTextbox();
        registerPage.confirmPasswordTextbox();
        registerPage.clickRegisterLink();
        registerPage.confirmText();
        registerPage.clickToContinueLink();
        registerPage.clickToMyAccountLink();

        myAccountPage = new MyAccountPageObject();
    }

    @Test
    public void TC_03_ComfirmInfo(){

    }


    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
