package PageObjects;

import org.openqa.selenium.*;

import java.util.Random;


public class packagesEditObjects {

    static WebDriver driver;

    public static By byPackages = By.cssSelector("div[title='Packages']");
    public static By byRecord = By.cssSelector("tr[class='MuiTableRow-root MuiTableRow-hover']");
    public static By byName = By.cssSelector("div[class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl']");
    public static By bySave = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn save-btn MuiButton-containedPrimary']");
    public static By byUpload = By.id("contained-button-file");
    public static By bySearchProduct = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[1]/div[2]/div/input");
    public static By byYes = By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn MuiButton-containedPrimary']");
    public static By byEditName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/input");
    public static By byEditDiscount = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div/div/input");
    public static By byEditDescription = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[3]/div/div/input");
    public static By bySuccessMessage = By.cssSelector("div[class='MuiCollapse-wrapperInner']");


    public packagesEditObjects(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickPackages() throws InterruptedException {
        driver.findElement(byPackages).click();
        Thread.sleep(2000);
    }

    public void clickRecord() throws InterruptedException {
        driver.findElement(byRecord).click();
        Thread.sleep(2000);
    }

    public void uploadImage() throws InterruptedException {
        WebElement uploadElement = driver.findElement(byUpload);
        uploadElement.sendKeys("/home/vend-aroma/Downloads/chocolate.jpeg");
        Thread.sleep(2000);
    }

    public int getRandomNumber() {
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextInt();
    }

    public void enterDetails() throws InterruptedException {
        WebElement element1 = driver.findElement(byEditName);
        element1.sendKeys(Keys.BACK_SPACE);
        for (int i = 0; i < 30; i++) {
            driver.findElement(byEditName).sendKeys(Keys.BACK_SPACE);
        }
        element1.sendKeys("Edit Name " + getRandomNumber());
        Thread.sleep(2000);

        WebElement element2 = driver.findElement(byEditDiscount);
        element2.sendKeys(Keys.BACK_SPACE);
        for (int i = 0; i < 20; i++) {
            driver.findElement(byEditDiscount).sendKeys(Keys.BACK_SPACE);
        }
        element2.sendKeys("10");
        Thread.sleep(2000);

        WebElement element3 = driver.findElement(byEditDescription);
        element3.sendKeys(Keys.BACK_SPACE);
        for (int i = 0; i < 30; i++) {
            driver.findElement(byEditDescription).sendKeys(Keys.BACK_SPACE);
        }
        element3.sendKeys("This is new description");
        Thread.sleep(2000);

    }

//    public void searchProduct() throws InterruptedException
//    {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySearchProduct));
//        driver.findElement(bySearchProduct).click();
//        Thread.sleep(2000);
//        driver.findElement(bySearchProduct).sendKeys("Tob alaraka number 1");
//        Thread.sleep(4000);
//        driver.findElement(By.cssSelector("div[class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-button']")).click();
//        Thread.sleep(4000);
//
//    }

    public void saveDetail() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySave));
        driver.findElement(bySave).click();
        Thread.sleep(4000);
    }

    public void yes() throws InterruptedException {
        driver.findElement(byYes).click();
        Thread.sleep(4000);
    }

    public boolean successMessage() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(bySuccessMessage));
        driver.findElement(bySuccessMessage).isDisplayed();
        //Thread.sleep(2000);
        return true;

    }

}