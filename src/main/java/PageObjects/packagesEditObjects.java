package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class packagesEditObjects {

    static WebDriver driver;

    public static By byPackages= By.cssSelector("div[title='Packages']");
    public static By byRecord = By.cssSelector("tr[class='MuiTableRow-root MuiTableRow-hover']");
    public static By byName = By.cssSelector("div[class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl']");
    public static By bySave = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn save-btn MuiButton-containedPrimary']");
    public static By byUpload = By.id("contained-button-file");
    public static By bySearchProduct = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[1]/div[2]/div/input");

    public packagesEditObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickPackages() throws InterruptedException {
        driver.findElement(byPackages).click();
        Thread.sleep(2000);
    }

    public void clickRecord() throws InterruptedException {
        driver.findElement(byRecord).click();
        Thread.sleep(2000);
    }

    public void uploadImage() throws InterruptedException {
        WebElement uploadElement = driver.findElement(byUpload);
        uploadElement.sendKeys("/home/vend-aroma/Downloads/chocolate.jpeg");
        Thread.sleep(2000);
    }

    public void enterDetails() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/input")).sendKeys("abc");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div/div/input")).sendKeys("10");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[3]/div/div/input")).sendKeys("like it");
        Thread.sleep(1000);
    }

//    public void searchProduct() throws InterruptedException
//    {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySearchProduct));
//        driver.findElement(bySearchProduct).click();
//        Thread.sleep(2000);
//        driver.findElement(bySearchProduct).sendKeys("Tob alaraka number 1");
//        Thread.sleep(4000);
//        driver.findElement(By.cssSelector("div[class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-button']")).click();
//        Thread.sleep(4000);
//
//    }

    public void saveDetail() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySave));
        driver.findElement(bySave).click();
        Thread.sleep(2000);
    }

}
