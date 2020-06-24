package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class bannerAddObjects {

    static WebDriver driver;

    public static By byAppBanners= By.cssSelector("div[title='App Banners']");
    public static By byAdd = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");
    public static By byUpload = By.id("contained-button-file");


    public bannerAddObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickAppBanners() throws InterruptedException {
        driver.findElement(byAppBanners).click();
        Thread.sleep(2000);
    }

    public void clickAdd() throws InterruptedException {
        driver.findElement(byAdd).click();
        Thread.sleep(2000);
    }

    public void uploadImage() throws InterruptedException {
        WebElement uploadElement = driver.findElement(byUpload);
        uploadElement.sendKeys("/home/vend-aroma/Downloads/bread.jpeg");
        Thread.sleep(2000);
    }


}
