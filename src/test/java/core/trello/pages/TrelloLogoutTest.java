package core.trello.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrelloLogoutTest extends BrowserFactory {

//    @BeforeTest
//    public void login(){
//        driver.manage().deleteAllCookies();
//        LoginPage loginPage = new LoginPage();
//        loginPage.openPage();
//        loginPage.submitLoginForm("k.plokho@gmail.com", "19921992qq");
//    }

    @Test
    public void logout(){
        driver.manage().deleteAllCookies();
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.submitLoginForm("k.plokho@gmail.com", "19921992qq");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Header.profileDropdownBtn));
        driver.findElement(Header.profileDropdownBtn).click();
        driver.findElement(Header.logoutBtn).click();
        Assert.assertEquals(driver.getCurrentUrl(), LogoutPage.URL);

    }
}
