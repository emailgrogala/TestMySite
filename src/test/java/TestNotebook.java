import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNotebook extends BaseTestConfig {

    @Test
    public void testMySite() {

        //open page
        driver.get("https://notebook-9e0d4.web.app");

        WebElement navTestingLink = driver.findElement(By.partialLinkText("Login"));
        navTestingLink.click();
        Assert.assertEquals("https://notebook-9e0d4.web.app/login", driver.getCurrentUrl());
        WebElement inputId = driver.findElement(By.id("username"));
//        inputId.clear();
        inputId.sendKeys("Greg");
//        inoutId.sendKeys(Keys.ENTER);
        WebElement inputName = driver.findElement(By.id("password"));
//        inputName.clear();
        inputName.sendKeys("gr");
//        inoutName.sendKeys(Keys.ENTER);
        WebElement buttonUpdate = driver.findElement(By.id("login"));
        buttonUpdate.click();
    }

}
