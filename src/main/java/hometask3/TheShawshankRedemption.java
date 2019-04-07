package hometask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class TheShawshankRedemption {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/hladka/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/title/tt0111161/");
        String title = driver.findElement(By.xpath("//div[@class='originalTitle']")).getText();
        String year = driver.findElement(By.xpath("//div/h1/span/a")).getText();
        String time = driver.findElement(By.xpath("//div[@class='subtext']/time")).getAttribute("datetime");
        int timeMin = Integer.parseInt(time.replaceAll("PT", "")
                .replaceAll("M", ""));
        int timeSec = timeMin * 60;
        String rating = driver.findElement(By.xpath("//div[@class='ratingValue']")).getText();
        String genre = driver.findElement(By.xpath("//div[@class='subtext']/a[1]")).getText();
        String trailer = driver.findElement(By.xpath("//span[@class='video_slate'][1]/a")).getAttribute("href");
        String poster = driver.findElement(By.xpath("//div[@class='poster']//img")).getAttribute("src");
        String director = driver.findElement(By.xpath("//div[@class = 'credit_summary_item'][1]/a")).getText();
        List<WebElement> castElems = driver.findElements(By.xpath("//tr[position()>1 and position()<7]/td[2]/a"));
        List<String> cast = new ArrayList<>();
        for (WebElement castElem : castElems){
            String elementAsString = castElem.getText();
            cast.add(elementAsString);
        }
        String metascore = driver.findElement(By.xpath("//div[@class='metacriticScore score_favorable titleReviewBarSubItem']"))
                .getText();
        int userReviews =Integer.parseInt(driver.findElement
                (By.xpath("//div[@class='titleReviewBarItem titleReviewbarItemBorder']//a[1]"))
                .getText().replaceAll("user", "").replaceAll(" ", ""));
        int criticReviews =Integer.parseInt(driver.findElement
                (By.xpath("//div[@class='titleReviewBarItem titleReviewbarItemBorder']//a[2]"))
                .getText().replaceAll("critic", "").replaceAll(" ", ""));

        List<WebElement> similarElems = driver.findElements(By.xpath("//div[@id='title_recs']/div[1]//div[position() > 1 and position() < 4]/a/img"));
        List<String> similar = new ArrayList<>();
        for (WebElement similarElem : similarElems){
            String elementAsString = similarElem.getAttribute("title");
            similar.add(elementAsString);
        }
        driver.quit();

        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Duration: " + timeMin + " minutes (" + timeSec + " seconds)");
        System.out.println("Rating: " + rating);
        System.out.println("Genre: " + genre);
        System.out.println("Trailer Link: " + trailer);
        System.out.println("Poster Link: " + poster);
        System.out.println("Director: " + director);
        System.out.println("Cast: " + cast.toString().replaceAll("\\[", "")
                .replaceAll("]", ""));
        System.out.println("Metascore Rating: " + metascore);
        System.out.println("User Reviews: " + userReviews);
        System.out.println("Critic Reviews: " + criticReviews);
        System.out.println("Total Reviews: " + (userReviews + criticReviews));
        System.out.println("Similar Movies: " + similar.toString().replaceAll("\\[", "")
                .replaceAll("]", ""));






    }
}
