package PageObjects;

import org.openqa.selenium.*;

import java.util.List;
import java.util.Random;

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
    public static By bySuccessMessage = By.cssSelector("div[class='MuiCollapse-wrapperInner']");


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

    public int getRandomNumber(){
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt();
    }

    public void editHub() throws InterruptedException
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byAddress1));
        WebElement element1 = driver.findElement(byAddress1);
        element1.sendKeys(Keys.BACK_SPACE);
        for (int i=0;i<20;i++) {
            driver.findElement(byAddress1).sendKeys(Keys.BACK_SPACE);
        }
        element1.sendKeys("Edit Address "+getRandomNumber());
      //  driver.findElement(byAddress1).sendKeys("Edit Address "+getRandomNumber());
        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(byAddress2));
        WebElement element2 = driver.findElement(byAddress2);
        element2.sendKeys(Keys.BACK_SPACE);
        for (int i=0;i<20;i++) {
            driver.findElement(byAddress2).sendKeys(Keys.BACK_SPACE);
        }
        element2.sendKeys("Edit Address "+getRandomNumber());
       // driver.findElement(byAddress2).sendKeys("Edit Address "+getRandomNumber());
        Thread.sleep(3000);

        WebElement element3 = driver.findElement(byHubName);
        element3.sendKeys(Keys.BACK_SPACE);
        for (int i=0;i<20;i++) {
            driver.findElement(byHubName).sendKeys(Keys.BACK_SPACE);
        }
        element3.sendKeys("Edit Address "+getRandomNumber());
       // driver.findElement(byHubName).sendKeys("Edit Address "+getRandomNumber());
        Thread.sleep(3000);
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
    public boolean successMessage()
    {
        driver.findElement(bySuccessMessage).isDisplayed();
        return true;
    }

}
