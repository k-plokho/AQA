package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class LiniaKinoMovies {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://liniakino.com/showtimes/aladdin/");
            List<WebElement> moviesElems = driver.findElements(By.cssSelector("ul h1"));
            List<String> moviesList = new ArrayList<>();
            for (WebElement moviesElem : moviesElems) {
                String elementAsString = moviesElem.getText();
                moviesList.add(elementAsString);
            }
            System.out.println("Movies: " + moviesList.toString().replaceAll("\\[", "")
                    .replaceAll("]", ""));

        }
}
