package hometask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Currency {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/hladka/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.privat24.ua/");
        String privateBuySell = driver.findElement(By.xpath("//div[2]/div[1]/div[2]")).getText();
        String[] privateSplit = privateBuySell.split(" / ");
        double privateBuy = Double.parseDouble(privateSplit[0]);
        double privateSell = Double.parseDouble(privateSplit[1]);

        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        double ukrsibBuy = Double.parseDouble(driver.findElement(By.xpath("//table[@class='currency__table']//tbody//tr[1]/td[2]")).getText());
        double ukrsibSell = Double.parseDouble(driver.findElement(By.xpath("//table[@class='currency__table']//tbody//tr[1]/td[3]")).getText());

        driver.get("https://www.universalbank.com.ua");
        double universalBuy = Double.parseDouble(driver.findElement(By.xpath("//table[@class='rate table table-bordered light fl-left m-t-2']//tr[2]/td[2]")).getText());
        double universalSell = Double.parseDouble(driver.findElement(By.xpath("//table[@class='rate table table-bordered light fl-left m-t-2']//tr[2]/td[3]")).getText());

        driver.get("https://www.oschadbank.ua/ua");
        double oschadBuy = Double.parseDouble(driver.findElement(By.xpath("//strong[@class='buy-USD']")).getAttribute("data-buy"));
        double oschadSell = Double.parseDouble(driver.findElement(By.xpath("//strong[@class='sell-USD']")).getAttribute("data-sell"));

        driver.get("https://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        double nbuRate = Double.parseDouble(driver.findElement(By.xpath("//tbody/tr[9]/td[5]")).getText()) / 100;

        double[] arrBuy = {privateBuy, ukrsibBuy, universalBuy, oschadBuy, nbuRate};
        double totalBuy = 0;
        for (int i = 0; i < arrBuy.length; i++) {
            totalBuy = totalBuy + arrBuy[i];
        }
        double avarageBuy = totalBuy / arrBuy.length;

        double[] arrSell = {privateSell, ukrsibSell, universalSell, oschadSell, nbuRate};
        double totalSell = 0;
        for (int i = 0; i < arrSell.length; i++) {
            totalSell = totalSell + arrSell[i];
        }
        double avarageSell = totalSell / arrSell.length;





        System.out.printf("Avarage rate for $ buy: %.2f\n", avarageBuy);
        System.out.printf("Avarage rate for $ sell: %.2f\n", avarageSell);

    }
}
