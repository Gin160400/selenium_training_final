package dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class handleDropdown {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demo.nopcommerce.com");
    }

    @Test
    public void TC_01_RegisterUser(){

    }

    @Test
    public void TC_02_VerifyInfo(){

    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

}
