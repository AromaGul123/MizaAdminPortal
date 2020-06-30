package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class retailerInventoryViewRecordObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailersInventory = By.cssSelector("div[title='Retailers Inventory']");
    public static By byView = By.cssSelector("tr[class='MuiTableRow-root MuiTableRow-hover']");
    public static By bySection = By.cssSelector("div[class='section-title']");
    public static By byId = By.cssSelector("button[class='MuiButtonBase-root MuiTab-root MuiTab-textColorInherit tab-root Mui-selected']");

    public retailerInventoryViewRecordObjects(WebDriver driver)
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

    public void clickRecord() throws InterruptedException {
        driver.findElements(byView).get(0).click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySection));
        Thread.sleep(2000);
    }
    public boolean idNumber()
    {
        driver.findElement(byId).isDisplayed();
        return true;
    }





}
