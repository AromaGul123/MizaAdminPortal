package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class packagesSearchObjects {

    static WebDriver driver;

    public static By byPackages = By.cssSelector("div[title='Packages']");
    public static By bySearchPackages=By.cssSelector("input[type='text']");

    public packagesSearchObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickPackages() throws InterruptedException {
        driver.findElement(byPackages).click();
        Thread.sleep(2000);
    }

    public void searchText() throws InterruptedException {
        driver.findElement(bySearchPackages).sendKeys("test");
        Thread.sleep(2000);
    }

}
