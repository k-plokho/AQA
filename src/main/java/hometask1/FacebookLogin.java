package hometask1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {
    public static void  main(String[] args) throws InterruptedException {
        // disabling Chrome's notification alert
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("[name='email']")).clear();
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("email@email.com");
        driver.findElement(By.cssSelector("[name='pass']")).clear();
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("12341234");
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("[name='mercurymessages']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".jewelContent li")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.cssSelector(".4tdt:nth-last-child(1) ._5yl5 span")).getText();
        System.out.println(text);
        driver.quit();
    }
}
