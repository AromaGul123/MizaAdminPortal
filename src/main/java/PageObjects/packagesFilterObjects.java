package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class packagesFilterObjects {

    static WebDriver driver;

    public static By byPackages = By.cssSelector("div[title='Packages']");
    public static By byFilterPackages = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained filter-btn']");
    public static By byActive = By.cssSelector("input[value='ACTIVATE']");
    public static By byApply = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-text filter-action-btn last-btn MuiButton-textPrimary']");


    public packagesFilterObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickPackages() throws InterruptedException {
        driver.findElement(byPackages).click();
        Thread.sleep(2000);
    }
    public void selectFilter() throws InterruptedException {
        driver.findElement(byFilterPackages).click();
        Thread.sleep(2000);
    }

    public void selectOptions() throws InterruptedException {
        driver.findElement(byActive).click();
        Thread.sleep(1000);
        driver.findElement(byApply).click();
        Thread.sleep(3000);
    }



}
