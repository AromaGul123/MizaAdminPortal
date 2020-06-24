package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class retailerUserSearchObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailerUsers = By.cssSelector("div[title='Retailer Users']");
    public static By bySearchRetailer=By.cssSelector("input[type='text']");

    public retailerUserSearchObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickRetailers() throws InterruptedException {
        driver.findElement(byRetailers).click();
        Thread.sleep(2000);
    }

    public static void clickRetailerUsers() throws InterruptedException {
        driver.findElement(byRetailerUsers).click();
        Thread.sleep(2000);
    }

    public void searchText() throws InterruptedException {
        driver.findElement(bySearchRetailer).sendKeys("test");
        Thread.sleep(2000);
    }





}
