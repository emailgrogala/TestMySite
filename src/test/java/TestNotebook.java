import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNotebook extends BaseTestConfig {

    @Test
    public void testMySite() {

        //open page
        driver.get("https://notebook-9e0d4.web.app");

        WebElement navTestingLink = driver.findElement(By.partialLinkText("Testing"));
        navTestingLink.click();
    }

}
