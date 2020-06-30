package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class createSelectedProduct {

    WebDriver driver;
    WebDriverWait wait;
    //public static By bySignUp= By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.promo-type-section > div.MuiTabs-root.tabs-container > div > div > button.MuiButtonBase-root.MuiTab-root.MuiTab-textColorInherit.tab-root.Mui-selected > span.MuiTab-wrapper");
    public static By bySelectedProduct = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/button[5]/span[1]");
    public static By byCreate = By.cssSelector("a[href='/promos/create']");
    public static By byTitle = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.meta-section > div.MuiFormControl-root.MuiTextField-root.half-field > div > input");
    public static By byDescription = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.meta-section > div:nth-child(2) > div > input");
    public static By byDiscountType = By.cssSelector("div[aria-haspopup='listbox']");
    public static By byPromoCode = By.cssSelector("input[name='promoCode']");
    public static By byAmountValue = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(1) > div.section-fields > div:nth-child(3) > div > input");
    public static By byUsageLimit = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(6) > div.section-fields > div:nth-child(1) > div > input");
    public static By byUsageLimitPerUser = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(6) > div.section-fields > div:nth-child(2) > div > input");
    public static By byminAmount = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(6) > div.section-fields > div:nth-child(3) > div > input");
    public static By bymaxDiscount =  By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.form-section > div:nth-child(6) > div.section-fields > div:nth-child(4) > div > input");
    public static By byCreatePromo = By.cssSelector("#root > div > div.main-section > div.route-root > div > div.create-promo-root > div > div.promo-body > div.promo-actions.promo-create-btn > button");
    public static By byYes = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");
    public static By byProductSelect = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/div[4]/div[3]/div/div[1]/div/input");
    public static By bySuccessMessage = By.cssSelector("div[class='MuiCollapse-wrapperInner']");


    public createSelectedProduct(WebDriver driver,WebDriverWait wait)
    {
        this.driver=driver;
        this.wait=wait;
    }

    public int getRandomNumber(){
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt();
    }

    public void clickCreate() throws InterruptedException {
        driver.findElement(byCreate).click();
       // Thread.sleep(2000);
    }

    public void promoDetail() throws InterruptedException {
        driver.findElement(byTitle).sendKeys("PromoVDSP "+getRandomNumber());
       // Thread.sleep(1000);
        driver.findElement(byDescription).sendKeys("This is a valid promo for VD");
       // Thread.sleep(1000);
    }
    public void clickSelectedProduct() throws InterruptedException {
        driver.findElement(bySelectedProduct).click();
      //  Thread.sleep(1000);
    }

    public void discountType(String option)
    {
        driver.findElement(byDiscountType).click();
        WebElement allElements = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul"));
        List<WebElement> discountList=allElements.findElements(By.tagName("li"));
        for (WebElement li : discountList) {
            if (li.getText().equals(option)) {
                li.click();
            }
        }
    }

    public void discountDetails() throws InterruptedException {
        driver.findElement(byPromoCode).sendKeys("PromoVDSP"+getRandomNumber());
        driver.findElement(byAmountValue).sendKeys("10");
       // Thread.sleep(2000);
    }
    public void product() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byProductSelect));
       // Thread.sleep(4000);
        driver.findElement(byProductSelect).click();
       // Thread.sleep(4000);
        driver.findElement(byProductSelect).sendKeys("Tob alsoltan 5");
       // Thread.sleep(4000);
        driver.findElement(By.cssSelector("div[class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-button']")).click();
       // Thread.sleep(4000);

    }

    public void restriction() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byUsageLimit));
        driver.findElement(byUsageLimit).sendKeys("5");
        //Thread.sleep(1000);
        driver.findElement(byUsageLimitPerUser).sendKeys("5");
       // Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byminAmount));
        driver.findElement(byminAmount).sendKeys("10");
       // Thread.sleep(1000);
        driver.findElement(bymaxDiscount).sendKeys("10");
       // Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byCreatePromo));
        driver.findElement(byCreatePromo).click();
    }
    public void yes() throws InterruptedException {
        driver.findElement(byYes).click();
        //Thread.sleep(2000);
    }

    public boolean successMessage() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySuccessMessage));
        driver.findElement(bySuccessMessage).isDisplayed();
        //Thread.sleep(2000);
        return true;
    }

}
