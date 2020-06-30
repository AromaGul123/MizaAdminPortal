package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class retailerUserViewRecordObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailerUsers = By.cssSelector("div[title='Retailer Users']");
    public static By byView = By.cssSelector("tr[class='MuiTableRow-root MuiTableRow-hover']");
    public static By bySection = By.cssSelector("span[class='mt-2']");
    public static By byIdNumber = By.cssSelector("button[class='MuiButtonBase-root MuiTab-root MuiTab-textColorInherit tab-root Mui-selected']");

    public retailerUserViewRecordObjects(WebDriver driver)
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

    public void clickRecord() throws InterruptedException {
        driver.findElement(byView).click();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySection));
        Thread.sleep(2000);
    }
    public boolean idNumber()
    {
        driver.findElement(byIdNumber).isDisplayed();
        return true;
    }




}
