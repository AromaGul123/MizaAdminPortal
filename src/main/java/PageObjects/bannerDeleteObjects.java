package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class bannerDeleteObjects {

    WebDriver driver;
    WebDriverWait wait;


    public static By byAppBanners= By.cssSelector("div[title='App Banners']");
    public static By byDelete = By.cssSelector("button[class='MuiButtonBase-root MuiIconButton-root circular-btn MuiIconButton-sizeSmall']");
    public static By byTick = By.cssSelector("#root > div > div.main-section > div.route-root > div > div > div.banner-list > div:nth-child(4) > div.d-flex.justify-content-between.align-items-center.banner-footer > div > button:nth-child(2) > span.MuiIconButton-label > svg");

    public bannerDeleteObjects(WebDriver driver, WebDriverWait wait)
    {
        this.driver=driver;
        this.wait=wait;
    }

    public void ClickAppBanners() throws InterruptedException {
//        driver.findElement(byAppBanners).click();
//        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(byAppBanners)).click();

    }

    public void ClickDelete() throws InterruptedException {
        driver.findElement(byDelete).click();
//        Thread.sleep(2000);
    }

    public void ClickTick() throws InterruptedException {
        driver.findElements(byDelete).get(1).click();
//        Thread.sleep(2000);
    }



}
