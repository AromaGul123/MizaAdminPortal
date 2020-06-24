package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class retailerUserFilterObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailerUsers = By.cssSelector("div[title='Retailer Users']");
    public static By byFilterRetailer = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained filter-btn']");
    public static By byActive = By.cssSelector("input[value='ACTIVE']");
    public static By byApply = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-text filter-action-btn last-btn MuiButton-textPrimary']");


    public retailerUserFilterObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickRetailers() throws InterruptedException {
        driver.findElement(byRetailers).click();
        Thread.sleep(2000);
    }

    public static void clickRetailerUser() throws InterruptedException {
        driver.findElement(byRetailerUsers).click();
        Thread.sleep(2000);
    }

    public void selectFilter() throws InterruptedException {
        driver.findElement(byFilterRetailer).click();
        Thread.sleep(2000);
    }

    public void selectOptions() throws InterruptedException {
        driver.findElement(byActive).click();
        Thread.sleep(2000);
        driver.findElement(byApply).click();
        Thread.sleep(3000);
    }




}
