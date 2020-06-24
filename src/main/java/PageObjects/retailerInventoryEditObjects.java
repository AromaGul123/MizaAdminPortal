package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class retailerInventoryEditObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailersInventory = By.cssSelector("div[title='Retailers Inventory']");
    public static By byAdd = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn button-root MuiButton-containedPrimary']");
    public static By byCreateNew = By.cssSelector("a[href='/retailer/create']");
    public static By  byAddress1 = By.name("address1");
    public static By byAddress2 = By.name("address2");
    public static By byHubName = By.name("hubName");
    public static By byHubType = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/div");
    public static By byServiceAreas = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[5]/div[3]/div/div");
    public static By byYes = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");
    public static By byRecord = By.cssSelector("tr[class='MuiTableRow-root MuiTableRow-hover']");
    public static By bySave = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained create-btn MuiButton-containedPrimary']");

    public retailerInventoryEditObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public static void clickRetailers() throws InterruptedException {
        driver.findElement(byRetailers).click();
        Thread.sleep(2000);
    }

    public static void clickRetailersInventory() throws InterruptedException {

        driver.findElement(byRetailersInventory).click();
        Thread.sleep(2000);
    }

    public void clickRecord() throws InterruptedException {

        driver.findElement(byRecord).click();
        Thread.sleep(2000);
    }

    public void editHub() throws InterruptedException
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byAddress1));
        driver.findElement(byAddress1).clear();
        driver.findElement(byAddress1).sendKeys("Test Address 1");
        Thread.sleep(2000);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byAddress2));
        driver.findElement(byAddress2).clear();
        driver.findElement(byAddress2).sendKeys("Test Address 2");
        Thread.sleep(2000);

        driver.findElement(byHubName).clear();
        driver.findElement(byHubName).sendKeys("Test Address");
        Thread.sleep(2000);
    }

    public void editHubType(String option)
    {
        driver.findElement(byHubType).click();
        WebElement allElements = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul"));
        List<WebElement> hubTypeList=allElements.findElements(By.tagName("li"));
        for (WebElement li : hubTypeList) {
            if (li.getText().equals(option)) {
                li.click();
            }
        }
    }

    public void editServiceAreas(String areas)
    {
        driver.findElement(byServiceAreas).click();
        WebElement allElements = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul"));
        List<WebElement> serviceAreas=allElements.findElements(By.tagName("li"));
        for (WebElement li : serviceAreas) {
            if (li.getText().equals(areas)) {
                li.click();
            }
        }
    }

    public void save() throws InterruptedException {
        driver.findElement(bySave).click();
        Thread.sleep(2000);

    }


    public void yesNo() throws InterruptedException {
        driver.findElement(byYes).click();
        Thread.sleep(2000);
    }

}
