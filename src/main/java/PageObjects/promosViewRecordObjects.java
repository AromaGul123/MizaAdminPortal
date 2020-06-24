package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class promosViewRecordObjects {

    static WebDriver driver;

    public static By byPromos = By.cssSelector("div[title='Promos']");
    public static By byView = By.cssSelector("tr[class='MuiTableRow-root MuiTableRow-hover']");

    public promosViewRecordObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickPromos() throws InterruptedException {
        driver.findElement(byPromos).click();
        Thread.sleep(2000);
    }

    public void clickRecord() throws InterruptedException {
        driver.findElement(byView).click();
        Thread.sleep(2000);
    }

}
