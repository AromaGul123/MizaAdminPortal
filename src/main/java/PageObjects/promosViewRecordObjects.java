package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class promosViewRecordObjects {

    static WebDriver driver;

    public static By byPromos = By.cssSelector("div[title='Promos']");
    public static By byView = By.cssSelector("tr[class='MuiTableRow-root MuiTableRow-hover']");
    public static By byId = By.cssSelector("button[class='MuiButtonBase-root MuiTab-root MuiTab-textColorInherit tab-root Mui-selected']");

    public promosViewRecordObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickPromos() throws InterruptedException {
        driver.findElement(byPromos).click();
        Thread.sleep(4000);
    }

    public void clickRecord() throws InterruptedException {
        driver.findElements(byView).get(0).click();
        Thread.sleep(3000);
    }
    public boolean idNumber() {
        driver.findElement(byId).isDisplayed();
        return true;
    }
    }

