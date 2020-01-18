import org.testng.annotations.Test;

public class LoginOnTestinPageTest extends BaseTestConfig {

    @Test
    public void LoginTest() {
        driver.get("https://notebook-9e0d4.web.app/login");
        TestingPage testingPage = new TestingPage(driver);

        testingPage.setUsernameField("Greg");
    }
}
