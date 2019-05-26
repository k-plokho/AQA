package core.trello.pages;

import static core.trello.pages.BrowserFactory.driver;


public abstract class Page {

    public Page() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    public void openPage(){
        driver.get(getPageURL());
    }

    public abstract String getPageURL();
}
