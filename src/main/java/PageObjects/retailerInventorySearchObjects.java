package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class retailerInventorySearchObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailersInventory = By.cssSelector("div[title='Retailers Inventory']");
    public static By bySearchRetailer=By.cssSelector("input[type='text']");

    public retailerInventorySearchObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickRetailers() throws InterruptedException {
        driver.findElement(byRetailers).click();
        Thread.sleep(2000);
    }

    public static void clickRetailersInventory() throws InterruptedException {
        driver.findElement(byRetailersInventory).click();
        Thread.sleep(2000);
    }

    public void searchText() throws InterruptedException {
        driver.findElement(bySearchRetailer).sendKeys("test");
        Thread.sleep(2000);
    }





}
