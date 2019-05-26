package core.trello.pages;

import org.openqa.selenium.By;
import static core.trello.pages.BrowserFactory.driver;

public class LoginPage extends Page {
    public static final String URL = "https://trello.com/en/login";
    private By emailFld = By.cssSelector("#user");
    private By passwordFld = By.cssSelector("#password");
    private By loginBtn = By.cssSelector("#login");
    protected By errorMessage = By.cssSelector("p.error-message");
    protected String invalidPasswordErrorText = "Invalid password";
    protected String invalidEmailErrorText = "There isn't an account for this email";

    @Override
    public String getPageURL() {
        return URL;
    }

    public void submitLoginForm(String email, String password) {
        driver.findElement(emailFld).clear();
        driver.findElement(emailFld).sendKeys(email);
        driver.findElement(passwordFld).clear();
        driver.findElement(passwordFld).sendKeys(password);
        driver.findElement(loginBtn).click();
    }
}
