package core.trello.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserFactory {
    public static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
//        driver = new EventFiringWebDriver(driver).register(WebDriverEventListener);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
