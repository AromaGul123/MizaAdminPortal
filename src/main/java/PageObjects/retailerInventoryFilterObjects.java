package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class retailerInventoryFilterObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailersInventory = By.cssSelector("div[title='Retailers Inventory']");
    public static By byFilterRetailer = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained filter-btn']");
    public static By byActive = By.cssSelector("input[value='ACTIVE']");
    public static By byHub = By.cssSelector("input[value='HUB']");
    public static By byApply = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");


    public retailerInventoryFilterObjects(WebDriver driver)
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

    public void selectFilter() throws InterruptedException {
        driver.findElement(byFilterRetailer).click();
        Thread.sleep(2000);
    }

    public void selectOptions() throws InterruptedException {
        driver.findElement(byActive).click();
        Thread.sleep(1000);
        driver.findElement(byHub).click();
        Thread.sleep(1000);
        driver.findElement(byApply).click();
        Thread.sleep(3000);
    }




}
