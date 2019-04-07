package hometask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Currency {
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/hladka/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //getting doubles for Privat Bank
        driver.get("https://www.privat24.ua/");
        String privateBuySell = driver.findElement(By.xpath("//div[2]/div[1]/div[2]")).getText();
        String[] privateSplit = privateBuySell.split(" / ");
        double privateBuy = Double.parseDouble(privateSplit[0]);
        double privateSell = Double.parseDouble(privateSplit[1]);
        Bank privateBank = new Bank(privateBuy, privateSell, "Private Bank");

        //getting doubles for Ukrsib Bank
        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        double ukrsibBuy = Double.parseDouble(driver.findElement(By.xpath("//table[@class='currency__table']//tbody//tr[1]/td[2]")).getText());
        double ukrsibSell = Double.parseDouble(driver.findElement(By.xpath("//table[@class='currency__table']//tbody//tr[1]/td[3]")).getText());
        Bank ukrsibBank = new Bank(ukrsibBuy, ukrsibSell, "Ukrsib Bank");

        //getting doubles for Universal Bank
        driver.get("https://www.universalbank.com.ua");
        double universalBuy = Double.parseDouble(driver.findElement(By.xpath("//table[@class='rate table table-bordered light fl-left m-t-2']//tr[2]/td[2]")).getText());
        double universalSell = Double.parseDouble(driver.findElement(By.xpath("//table[@class='rate table table-bordered light fl-left m-t-2']//tr[2]/td[3]")).getText());
        Bank universalBank = new Bank(ukrsibBuy, ukrsibSell, "Universal Bank");

        //getting doubles for Oschad Bank
        driver.get("https://www.oschadbank.ua/ua");
        double oschadBuy = Double.parseDouble(driver.findElement(By.xpath("//strong[@class='buy-USD']")).getAttribute("data-buy"));
        double oschadSell = Double.parseDouble(driver.findElement(By.xpath("//strong[@class='sell-USD']")).getAttribute("data-sell"));
        Bank oschadBank = new Bank(oschadBuy, oschadSell, "Oschad Bank");

        //getting doubles for NBU
        driver.get("https://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        double nbuRate = Double.parseDouble(driver.findElement(By.xpath("//tbody/tr[9]/td[5]")).getText()) / 100;
        Bank nbu = new Bank(nbuRate, nbuRate, "NBU");

        //calculating avarage buy rate
        double[] arrBuy = {privateBuy, ukrsibBuy, universalBuy, oschadBuy, nbuRate};
        double totalBuy = 0;
        for (int i = 0; i < arrBuy.length; i++) {
            totalBuy = totalBuy + arrBuy[i];
        }
        double avarageBuy = totalBuy / arrBuy.length;

        //calculating avarage sell rate
        double[] arrSell = {privateSell, ukrsibSell, universalSell, oschadSell, nbuRate};
        double totalSell = 0;
        for (int i = 0; i < arrSell.length; i++) {
            totalSell = totalSell + arrSell[i];
        }
        double avarageSell = totalSell / arrSell.length;

        //crating list of banks
        List<Bank> banks = new ArrayList<>();
        banks.add(privateBank);
        banks.add(ukrsibBank);
        banks.add(universalBank);
        banks.add(oschadBank);
        banks.add(nbu);

        //sorting banks by buy rate and selecting one with the lowest buy rate
        Collections.sort(banks, new Comparator<Bank>() {
            @Override
            public int compare(Bank o1, Bank o2) {
                return Double.compare(o1.getBuy(), o2.getBuy());
            }
        });
        Bank lowestBuyBank = banks.get(0);

        //sorting banks by sell rate and selecting one with the highest sell rate
        Collections.sort(banks, new Comparator<Bank>() {
            @Override
            public int compare(Bank o1, Bank o2) {
                return Double.compare(o2.getSell(), o1.getSell());
            }
        });
        Bank highestSellBank = banks.get(0);

        //printing all that staff
        System.out.printf("Avarage rate for $ buy: %.2f\n", avarageBuy);
        System.out.printf("Avarage rate for $ sell: %.2f\n", avarageSell);
        System.out.println("Bank with the lowest buy rate: " + lowestBuyBank.getName());
        System.out.println("Bank with the highest sell rate: " + highestSellBank.getName());
    }
}

//creating Bank class
class Bank{
    double buy;
    double sell;
    String name;

    public Bank(double buy, double sell, String name) {
        this.buy = buy;
        this.sell = sell;
        this.name = name;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}