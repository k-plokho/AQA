package hometask4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Akinator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ru.akinator.com");
        driver.findElement(By.xpath("//div[@class='btn-play']")).click();
        Thread.sleep(3000);

        int nextQuestionNumber = 2;

        while (5 == driver.findElements(By.xpath("//div[@class='database-selection selector dialog-box']/ul/li")).size()) {
            WebElement question = driver.findElement(By.xpath("//p[@class='question-text']"));
            System.out.println(question.getText());
            List<WebElement> answrsElems = driver.findElements(By.xpath("//div[@class='database-selection selector dialog-box']/ul/li"));
            int answrNumber = 0;
            for(WebElement answrsElem : answrsElems){
                answrNumber++;
                System.out.println(answrNumber + ") " + answrsElem.getText());
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter an answer's number!!!");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1: answrsElems.get(0).click();
                     break;
                case 2: answrsElems.get(1).click();
                    break;
                case 3: answrsElems.get(2).click();
                    break;
                case 4: answrsElems.get(3).click();
                    break;
                case 5: answrsElems.get(4).click();
                    break;
            }
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@id='div-overlay']/img"))));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("...And the result is...");
        System.out.println(driver.findElement(By.xpath("//span[@class='proposal-title']")).getText());
        System.out.println("Am I right?");
        System.out.println("1 - YES, 2 - NO");
        int userInput2 = scanner.nextInt();
        if (userInput2 == 1) {
            System.out.println("CONGRATS!!! IT WAS AMAZING GAME!");
        }
        else if (userInput2 == 2) {
            System.out.println("OH NO :( LET'S TRY AGAIN LATER! BYE BYE!!!");
        }
        else {
            System.out.println("IT'S INVALID INPUT!!! BYE BYE!!!");
        }
        driver.quit();
    }
}
