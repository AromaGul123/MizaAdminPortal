package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class promosFilterObjects {

    static WebDriver driver;

    public static By byPromos = By.cssSelector("div[title='Promos']");
    public static By byFilter = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained filter-btn']");
    public static By byInactive = By.cssSelector("input[value='INACTIVE']");
    public static By byApply = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-text filter-action-btn last-btn MuiButton-textPrimary']");

    public promosFilterObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickPromos() throws InterruptedException {
        driver.findElement(byPromos).click();
        Thread.sleep(2000);
    }

    public void clickFilter() throws InterruptedException {
        driver.findElement(byFilter).click();
        Thread.sleep(2000);
        driver.findElement(byInactive).click();
        Thread.sleep(2000);
        driver.findElement(byApply).click();
        Thread.sleep(2000);

    }

}
