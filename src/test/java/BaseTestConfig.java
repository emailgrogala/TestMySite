import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTestConfig {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        //what driver we want to use
        String driverPath = "./src/main/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        //interface WebDriver
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}

