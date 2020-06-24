package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class packagesStatusObjects {

    static WebDriver driver;
    public static By byPackages = By.cssSelector("div[title='Packages']");
    public static By byStatus = By.cssSelector("div[title='Package is active']");
    public static By byYes = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");

    public packagesStatusObjects(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickPackages() throws InterruptedException {
        driver.findElement(byPackages).click();
        Thread.sleep(2000);
    }

    public void activeStatus() throws InterruptedException {
        driver.findElement(byStatus).click();
        Thread.sleep(2000);
    }

    public void yesNo() throws InterruptedException {
        driver.findElement(byYes).click();
        Thread.sleep(2000);
    }


}
