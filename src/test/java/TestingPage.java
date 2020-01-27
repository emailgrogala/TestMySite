import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

    @FindBy(id = "loginStatus")
//    @CacheLookup
    private WebElement loginStatus;

    @FindBy(id = "username")
//    @CacheLookup
    private WebElement usernameField;

    @FindBy(id = "password")
//    @CacheLookup
    private WebElement passwordField;

    @FindBy(id = "login")
//    @CacheLookup
    private WebElement buttonLogin;

    public TestingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String checkLoginStatus(){
        return loginStatus.getText();
    }
    public void setUsernameField(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public void setPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void clickButtonLogin() {
        buttonLogin.click();
    }

    public void loginTestPositive(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        clickButtonLogin();
    }
}
