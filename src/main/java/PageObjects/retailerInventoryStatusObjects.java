package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class retailerInventoryStatusObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailersInventory = By.cssSelector("div[title='Retailers Inventory']");
    public static By byStatus = By.cssSelector("div[title='Retailer is active']");
    public static By byYes = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");
    public static By bySuccessMessage = By.cssSelector("div[class='MuiCollapse-wrapperInner']");


    public retailerInventoryStatusObjects(WebDriver driver)
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

    public void activeStatus() throws InterruptedException {
        driver.findElement(byStatus).click();
        Thread.sleep(2000);
    }

    public void yesNo() throws InterruptedException
    {
//        WebElement allElements = driver.findElement(By.cssSelector("div[class='d-flex justify-content-center confirmation-actions']"));
//        List<WebElement> optionList=allElements.findElements(By.tagName("span"));
//        for (WebElement span : optionList) {
//            if (span.getText().equals(option)) {
//                span.click();
//            }
//        }
        driver.findElement(byYes).click();
        Thread.sleep(2000);
    }

    public boolean successMessage()
    {
        driver.findElement(bySuccessMessage).isDisplayed();
        return true;
    }
}
