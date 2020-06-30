package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class bannerAddObjects {

    WebDriver driver;
    WebDriverWait wait;

    public static By byAppBanners= By.cssSelector("div[title='App Banners']");
    public static By byAdd = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");
    public static By byUpload = By.id("contained-button-file");

    public bannerAddObjects(WebDriver driver, WebDriverWait wait)
    {
        this.driver=driver;
        this.wait=wait;
    }

    public void ClickAppBanners() throws InterruptedException {
//      driver.findElement(byAppBanners).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(byAppBanners)).click();
//      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);


    }

    public void UploadImage() throws InterruptedException {
        WebElement uploadElement = driver.findElement(byUpload);
        uploadElement.sendKeys("/home/vend-aroma/Downloads/bread.jpeg");
//      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

    }


}
