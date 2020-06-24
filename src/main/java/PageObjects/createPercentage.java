package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class createPercentage {

    WebDriver driver;
    public static By byCreate = By.cssSelector("a[href='/promos/create']");
    public static By byTitle = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.meta-section > div.MuiFormControl-root.MuiTextField-root.half-field > div > input");
    public static By byDescription = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.meta-section > div:nth-child(2) > div > input");
    public static By byPercentage = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.promo-type-section > div.MuiTabs-root.tabs-container > div > div > button:nth-child(2) > span.MuiTab-wrapper");
    public static By byPercentageValue = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(1) > div.section-fields > div:nth-child(1) > div > input");
    public static By byPromoCode = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(1) > div.section-fields > div:nth-child(2) > div > input");
    public static By byUsageLimit = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(6) > div.section-fields > div:nth-child(1) > div > input");
    public static By byUsageLimitPerUser = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(6) > div.section-fields > div:nth-child(2) > div > input");
    public static By byminAmount = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(6) > div.section-fields > div:nth-child(3) > div > input");
    public static By bymaxDiscount =  By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(6) > div.section-fields > div:nth-child(4) > div > input");
    public static By byCreatePromo = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.promo-actions.promo-create-btn > button");
    public static By byYes = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");


    public createPercentage(WebDriver driver)
    {
        this.driver=driver;
        //this.wait=wait;
    }

    public void clickCreate() throws InterruptedException {
        driver.findElement(byCreate).click();
        Thread.sleep(2000);
    }

    public void promoDetail() throws InterruptedException {
        driver.findElement(byTitle).sendKeys("PromoVDP");
        Thread.sleep(1000);
        driver.findElement(byDescription).sendKeys("This is a valid promo for VD");
        Thread.sleep(1000);
    }

    public void clickPercentage() throws InterruptedException {
        driver.findElement(byPercentage).click();
        Thread.sleep(1000);
    }
    public void discountDetails() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byPercentageValue));
        Thread.sleep(1000);
        driver.findElement(byPercentageValue).sendKeys("20");
        Thread.sleep(1000);
        driver.findElement(byPromoCode).sendKeys("Promo1234D");
    }

    public void restriction() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byUsageLimit));
        driver.findElement(byUsageLimit).sendKeys("5");
        Thread.sleep(1000);
        driver.findElement(byUsageLimitPerUser).sendKeys("5");
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byminAmount));
        driver.findElement(byminAmount).sendKeys("10");
        Thread.sleep(1000);
        driver.findElement(bymaxDiscount).sendKeys("10");
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byCreatePromo));
        driver.findElement(byCreatePromo).click();
    }
    public void yes() throws InterruptedException {
        driver.findElement(byYes).click();
        Thread.sleep(2000);
    }
}
