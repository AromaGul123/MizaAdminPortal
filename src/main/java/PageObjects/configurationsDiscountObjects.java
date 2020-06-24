package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class configurationsDiscountObjects {

    static WebDriver driver;

    public static By byConfigurations= By.cssSelector("div[title='Configurations']");
    public static By bySelectConfig = By.cssSelector("div[class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl']");
    public static By bySelectValue = By.cssSelector("input[type='text']");
    public static By bySave = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained create-btn MuiButton-containedPrimary']");

    public configurationsDiscountObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickConfigurations() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byConfigurations));
        driver.findElement(byConfigurations).click();
        Thread.sleep(2000);
    }

    public static void selectConfig(String option) throws InterruptedException {
        driver.findElement(bySelectConfig).click();
        Thread.sleep(1000);
        WebElement allElements = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul"));
        List<WebElement> configList=allElements.findElements(By.tagName("li"));
        for (WebElement li : configList) {
            if (li.getText().equals(option)) {
                li.click();
            }
        }
    }

    public static void selectDiscountValue() throws InterruptedException {
        driver.findElement(bySelectValue).click();
        driver.findElement(bySelectValue).clear();
        driver.findElement(bySelectValue).sendKeys("55");
        Thread.sleep(2000);
    }

    public static void save() throws InterruptedException {
        driver.findElement(bySave).click();
        Thread.sleep(2000);
    }


}
