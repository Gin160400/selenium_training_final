import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {

    private WebDriver driver;

    public HomePageObject() {
        this.driver = driver;
    }

    public void clickToRegisterLink() {
        clickToElement(drive,HomePageUI.REGISTER_LINK);
    }
}
