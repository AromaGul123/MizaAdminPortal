package PageObjects;

import org.openqa.selenium.*;

import java.util.List;


public class configurationsDiscountObjects {

    static WebDriver driver;

    public static By byConfigurations= By.cssSelector("div[title='Configurations']");
    public static By bySelectConfig = By.cssSelector("div[class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl']");
    public static By bySelectValue = By.cssSelector("input[type='text']");
    public static By bySave = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained create-btn MuiButton-containedPrimary']");
    public static By bySuccessMessage = By.cssSelector("div[class='MuiSnackbarContent-message']");


    public configurationsDiscountObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickConfigurations() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byConfigurations));
        driver.findElement(byConfigurations).click();
       // Thread.sleep(2000);
    }

    public static void selectConfig() throws InterruptedException {
        driver.findElement(bySelectConfig).click();
        //Thread.sleep(1000);
//        WebElement allElements = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul"));
//        List<WebElement> configList=allElements.findElements(By.tagName("li"));
//        for (WebElement li : configList) {
//            if (li.getText().equals(option)) {
//                li.click();
//            }
//        }
        driver.findElements(By.cssSelector("li[class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).get(3).click();
       // Thread.sleep(2000);
    }

    public static void selectDiscountValue() throws InterruptedException {
        WebElement element = driver.findElement(bySelectValue);
        element.sendKeys(Keys.BACK_SPACE);
        for (int i=0;i<30;i++) {
            driver.findElement(bySelectValue).sendKeys(Keys.BACK_SPACE);
        }
        element.sendKeys("20");
    }

    public static void save() throws InterruptedException {
        driver.findElement(bySave).click();
       // Thread.sleep(2000);
    }

    public boolean successMessage() throws InterruptedException {

        driver.findElement(bySuccessMessage).isDisplayed();
       // Thread.sleep(2000);
        return true;
    }

}
