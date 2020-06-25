package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class retailerInventoryAddObjects {

    static WebDriver driver;

    public static By byRetailers = By.cssSelector("div[title='Retailers']");
    public static By byRetailersInventory = By.cssSelector("div[title='Retailers Inventory']");
    public static By byAdd = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn button-root MuiButton-containedPrimary']");
    public static By byCreateNew = By.cssSelector("a[href='/retailer/create']");
    public static By  byAddress1 = By.name("address1");
    public static By byAddress2 = By.name("address2");
    public static By byHubName = By.name("hubName");
    public static By byHubType = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[4]/div[2]/div");
    public static By byServiceAreas = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/div[4]/div[3]/div");
    public static By byCreate = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained create-btn MuiButton-containedPrimary']");
    public static By byYes = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");

    public retailerInventoryAddObjects(WebDriver driver)
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

    public void clickAdd() throws InterruptedException {
        driver.findElement(byAdd).click();
        Thread.sleep(2000);
        driver.findElement(byCreateNew).click();
        Thread.sleep(3000);
    }


    public int getRandomNumber(){
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt();
    }

    public void createNewHub() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byAddress1));
        driver.findElement(byAddress1).sendKeys("Address "+getRandomNumber());
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byAddress2));
        driver.findElement(byAddress2).sendKeys("Address "+getRandomNumber());
        Thread.sleep(2000);
        driver.findElement(byHubName).sendKeys("Address "+getRandomNumber());
        Thread.sleep(2000);
    }

    public void hubType(String option)
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

    public void serviceAreas(String areas)
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

    public void create() throws InterruptedException {
        driver.findElement(byCreate).click();
        Thread.sleep(2000);
    }

    public void yesNo() throws InterruptedException {
        driver.findElement(byYes).click();
        Thread.sleep(2000);
    }

}
