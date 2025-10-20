import org.openqa.selenium.WebDriver;

public class RegisterPageObject extends BasePage {

    public RegisterPageObject() {
        this.driver = driver;
    }

    private WebDriver driver;

    public void genderMaleCheckbox() {
        selectItemInDropdown(drive,RegisterPageUI.GENDER_LINK,"Male");
    }

    public void firstNameTextbox() {
        sendKeyToElement(drive,RegisterPageUI.FIRSTNAME_TEXTBOX,"Gin");
    }

    public void lastNameTextbox() {
        sendKeyToElement(drive,RegisterPageUI.LASTNAME_TEXTBOX,"Dang");
    }

    public void companyNameTextbox() {
    }

    public void passwordTextbox() {
    }

    public void confirmPasswordTextbox() {
    }

    public void clickRegisterLink() {
    }

    public void confirmText() {
    }

    public void clickToContinueLink() {
    }

    public void clickToMyAccountLink() {
    }
}
