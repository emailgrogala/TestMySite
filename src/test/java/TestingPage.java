import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    public TestingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setUsernameField(String username) {
        usernameField.clear();
        usernameField.sendKeys("Greg");
    }
}
