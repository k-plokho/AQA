package core.trello.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TrelloLoginTest extends BrowserFactory {

    @AfterTest
    public void deleteCoockies(){
        driver.manage().deleteAllCookies();
    }

    @Test
    public void testASuccessLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.submitLoginForm("k.plokho@gmail.com", "19921992qq");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(loginPage.getPageURL())));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[name=referrer]+title")));
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, BoardPage.TITLE);
    }

    @Test
    public void testBLoginWithWrongPassword(){
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.submitLoginForm("k.plokho@gmail.com", "19921992");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.errorMessage));
        String actualErrorText = driver.findElement(loginPage.errorMessage).getText();
        Assert.assertEquals(actualErrorText, loginPage.invalidPasswordErrorText);
    }

    @Test
    public void testCLoginWithWrongEmail(){
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.submitLoginForm("k.plokhooo6543@gmail.com", "19921992");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.errorMessage));
        String actualErrorText = driver.findElement(loginPage.errorMessage).getText();
        Assert.assertEquals(actualErrorText, loginPage.invalidEmailErrorText);
    }

}
