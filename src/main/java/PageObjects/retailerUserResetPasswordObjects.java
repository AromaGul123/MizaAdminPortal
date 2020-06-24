package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class retailerUserResetPasswordObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailerUsers = By.cssSelector("div[title='Retailer Users']");
    public static By byView = By.cssSelector("tr[class='MuiTableRow-root MuiTableRow-hover']");
    public static By byResetPassword = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-text theme-btn text-capitalize MuiButton-textPrimary']");
    public static By byPassword = By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[1]/div/input");
    public static By bySave = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");

    public retailerUserResetPasswordObjects(WebDriver driver)
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
        Thread.sleep(000);

    }

    public void resetPassword() throws InterruptedException
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byResetPassword));
        driver.findElement(byResetPassword).click();
        Thread.sleep(2000);
        driver.findElement(byPassword).sendKeys("Aroma123");
        Thread.sleep(2000);
        driver.findElement(bySave).click();
        Thread.sleep(2000);

    }


}
