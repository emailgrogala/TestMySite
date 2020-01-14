import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchInputTest extends  BaseTestConfig{

    @Test
    public void testMySite(){

        //open page
        driver.get("https://google.com");

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);

        WebElement seleniumPageLink = driver.findElement(By.partialLinkText("Selenium"));
        seleniumPageLink.click();

        System.out.println(driver.getTitle());
        String expectedTittle = "SeleniumHQ Browser Automation";

        Assert.assertEquals(expectedTittle,"SeleniumHQ Browser Automation");

    }
}
