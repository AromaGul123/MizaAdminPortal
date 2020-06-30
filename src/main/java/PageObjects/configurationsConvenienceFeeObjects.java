package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;


public class configurationsConvenienceFeeObjects {

    WebDriver driver;
    WebDriverWait wait;


    public static By byConfigurations= By.cssSelector("div[title='Configurations']");
    public static By bySelectConfig = By.cssSelector("div[class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl']");
    public static By bySelectValue = By.cssSelector("input[type='text']");
    public static By bySave = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained create-btn MuiButton-containedPrimary']");
    public static By bySuccessMessage = By.cssSelector("div[class='MuiSnackbarContent-message']");

    public configurationsConvenienceFeeObjects(WebDriver driver,WebDriverWait wait)
    {
        this.driver=driver;
        this.wait=wait;
    }

    public void ClickConfigurations() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byConfigurations));
        driver.findElement(byConfigurations).click();
//        Thread.sleep(2000);
    }

    public void SelectConfig() throws InterruptedException {
        driver.findElement(bySelectConfig).click();
        driver.findElements(By.cssSelector("li[class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).get(1).click();
//        Thread.sleep(2000);
    }

    public void SelectConvenienceFeeValue() throws InterruptedException {

        WebElement element = driver.findElement(bySelectValue);
        element.sendKeys(Keys.BACK_SPACE);
        for (int i=0;i<10;i++) {
            driver.findElement(bySelectValue).sendKeys(Keys.BACK_SPACE);
        }
        element.sendKeys("45");
    }

    public void Save() throws InterruptedException {
        driver.findElement(bySave).click();
//        Thread.sleep(2000);
    }

    public boolean SuccessMessage() throws InterruptedException {

        boolean message= driver.findElement(bySuccessMessage).isDisplayed();
//        Thread.sleep(2000);
        return message;
    }


}
