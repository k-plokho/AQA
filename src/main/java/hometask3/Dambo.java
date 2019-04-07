package hometask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dambo {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/hladka/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://liniakino.com/showtimes/aladdin/");
        driver.findElement(By.xpath("//h1/a[text()='Дамбо']")).click();
        driver.findElement(By.xpath("//div[@class='buttons']")).click();
        driver.findElement(By.xpath("//div[@class='day-block showtime-day'][1]/div[@class='showtime-theater'][1]/ul[@class='showtime-time'][1]/li[1]/a[1]")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='window-close arcticmodal-close']")).click();
        List<WebElement> notOccupiedList = driver.findElements(By.xpath("//div[@id='hall-scheme-container']//div[@class='seat seat-color1']"));
        List<WebElement> occupiedList = driver.findElements(By.xpath("//div[@class='seat seat-occupied']"));
        driver.quit();
        float notOccupied = (float) notOccupiedList.size();
        float occupied = (float) occupiedList.size();
        float total = notOccupied + occupied;
        float notOccupiedPerc = (notOccupied * 100) / total;
        float occupiedPerc = (occupied * 100) / total;

        System.out.println("Total number of seats: " + (occupiedList.size() + notOccupiedList.size()));
        System.out.println("Not occupied seats: " + notOccupiedList.size() + " (" + notOccupiedPerc + "%)");
        System.out.println("Occupied seats: " + occupiedList.size() + " (" + occupiedPerc + "%)");
    }
}
