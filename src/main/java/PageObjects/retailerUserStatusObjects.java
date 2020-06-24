package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class retailerUserStatusObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailerUsers= By.cssSelector("div[title='Retailer Users']");
    public static By byStatus = By.cssSelector("div[title='Retailer is active']");
    public static By byYes = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");

    public retailerUserStatusObjects(WebDriver driver)
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

    public void activeStatus() throws InterruptedException {
        driver.findElement(byStatus).click();
        Thread.sleep(2000);
    }

    public void yesNo() throws InterruptedException
    {
        driver.findElement(byYes).click();
        Thread.sleep(4000);
    }





}
