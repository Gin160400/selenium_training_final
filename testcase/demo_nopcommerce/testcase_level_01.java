package demo_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static demo_nopcommerce.pageUILocator.*;

public class testcase_level_01 extends commons {
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demo.nopcommerce.com");
    }

    @Test
    public void TC_01_LoginUser(){
        getWebElement(driver, login_button).click();
        sendKeyToElement(driver, email,"gindang123@gmail.com");
        sendKeyToElement(driver, password,"123456");
        getWebElement(driver,login).click();
    }

    @Test
    public void TC_02_VerifyInfo(){
        getWebElement(driver, myAccount).click();

        //driver.switchTo().parentFrame(("https://demo.nopcommerce.com/customer/info"));
        getWebElement(driver, addresses).click();
        getWebElement(driver,addNewAddress).click();
        selectItemDropDownDefault(driver, dropdownCountry,"Vietnam");


    }

    @AfterClass
    public void afterClass(){
        //driver.quit();
    }

}
