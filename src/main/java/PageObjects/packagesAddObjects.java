package PageObjects;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;

import javax.swing.*;
import java.util.List;
import java.util.Random;


public class packagesAddObjects {

    static WebDriver driver;

    public static By byAppBanners = By.cssSelector("div[title='Packages']");
    public static By byCreate = By.cssSelector("a[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn text-white MuiButton-containedPrimary']");
    public static By byName = By.cssSelector("div[class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl']");
    public static By bySave = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn save-btn MuiButton-containedPrimary']");
    public static By byUpload = By.id("contained-button-file");
    public static By bySearchProduct = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[1]/div[2]/div/input");
    public static By byYes = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");
    public static By byPackageName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/input");
    public static By byDiscount = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div/div/input");
    public static By byDescription = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[3]/div/div/input");
    public static By bySuccessMessage = By.cssSelector("div[class='MuiCollapse-wrapperInner']");


    public packagesAddObjects(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickPackages() throws InterruptedException {
        driver.findElement(byAppBanners).click();
        Thread.sleep(2000);
    }

    public void clickCreate() throws InterruptedException {
        driver.findElement(byCreate).click();
        Thread.sleep(2000);
    }

    public void uploadImage() throws InterruptedException {
        WebElement uploadElement = driver.findElement(byUpload);
        uploadElement.sendKeys("/home/vend-aroma/Downloads/bread.jpeg");
        Thread.sleep(2000);
    }

    public int getRandomNumber() {
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt();
    }

    public void enterDetails() throws InterruptedException {
        WebElement element1 = driver.findElement(byPackageName);
        element1.sendKeys("Package Name " + getRandomNumber());
        Thread.sleep(2000);

        WebElement element2 = driver.findElement(byDiscount);
        element2.sendKeys("10");
        Thread.sleep(2000);

        WebElement element3 = driver.findElement(byDescription);
        element3.sendKeys("This is description");
        Thread.sleep(2000);


    }

    public void searchProduct() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySearchProduct));
        driver.findElement(bySearchProduct).click();
        Thread.sleep(2000);
        driver.findElement(bySearchProduct).sendKeys("Tob alaraka number 1");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("div[class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-button']")).click();
        Thread.sleep(4000);

    }

    public void saveDetail() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySave));
        Thread.sleep(4000);
        driver.findElement(bySave).click();
        Thread.sleep(2000);
    }

    public void yes() throws InterruptedException {
        driver.findElement(byYes).click();
        Thread.sleep(2000);
    }

    public boolean successMessage() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySuccessMessage));
        driver.findElement(bySuccessMessage).isDisplayed();
        //Thread.sleep(2000);
        return true;

    }
}
