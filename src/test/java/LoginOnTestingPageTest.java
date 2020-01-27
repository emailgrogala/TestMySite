import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class LoginOnTestingPageTest extends BaseTestConfig {

    @Test
    public void LoginTest() {
        driver.get("https://notebook-9e0d4.web.app/login");
        TestingPage testingPage = new TestingPage(driver);

//        testingPage.setUsernameField("Greg");
//        testingPage.setPasswordField("gr");
//        testingPage.clickButtonLogin();
//        Assert.assertEquals("Logged", testingPage.checkLoginStatus());

        testingPage.loginTestPositive("Greg", "gr");
        Assert.assertEquals("Logged", testingPage.checkLoginStatus());
    }

}
