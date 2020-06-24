package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class bannerDeleteObjects {

    static WebDriver driver;

    public static By byAppBanners= By.cssSelector("div[title='App Banners']");
    public static By byDelete = By.cssSelector("button[class='MuiButtonBase-root MuiIconButton-root circular-btn MuiIconButton-sizeSmall']");
    public static By byTick = By.cssSelector("#root > div > div.main-section > div.route-root > div > div > div.banner-list > div:nth-child(4) > div.d-flex.justify-content-between.align-items-center.banner-footer > div > button:nth-child(2) > span.MuiIconButton-label > svg");

    public bannerDeleteObjects(WebDriver driver)
    {
        this.driver=driver;
    }

//    public static void clickAppBanners() throws InterruptedException {
//        driver.findElement(byAppBanners).click();
//        Thread.sleep(2000);
//    }

    public void clickDelete() throws InterruptedException {
        driver.findElement(byDelete).click();
        Thread.sleep(2000);
    }

    public void clickTick() throws InterruptedException {
        driver.findElements(byDelete).get(1).click();
        Thread.sleep(2000);
    }



}
