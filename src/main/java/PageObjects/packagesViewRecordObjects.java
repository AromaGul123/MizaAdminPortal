package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class packagesViewRecordObjects {

    static WebDriver driver;

    public static By byPackages= By.cssSelector("div[title='Packages']");
    public static By byView = By.cssSelector("tr[class='MuiTableRow-root MuiTableRow-hover']");

    public packagesViewRecordObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickPromos() throws InterruptedException {
        driver.findElement(byPackages).click();
        Thread.sleep(2000);
    }

    public void clickRecord() throws InterruptedException {
        driver.findElement(byView).click();
        Thread.sleep(2000);
    }

}
