package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class promoObjects {

    static WebDriver driver;

    public static By byPromos=By.cssSelector("div[title='Promos']");
    public static By bySearchPromo=By.cssSelector("input[type='text']");
    public static By byStatus=By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained theme-btn status-drop-btn green-btn MuiButton-containedPrimary']");
    public static By byInactive=By.cssSelector("div[class='MuiButtonBase-root MuiListItem-root MuiListItem-gutters MuiListItem-button']");

    public promoObjects(WebDriver driver)
    {
        this.driver=driver;
        //this.wait=wait;
    }

    public static void clickPromos() throws InterruptedException {
        driver.findElement(byPromos).click();
        Thread.sleep(3000);
    }

    public void searchText() throws InterruptedException {
        driver.findElement(bySearchPromo).sendKeys("test");
        Thread.sleep(2000);
    }

    public void activeStatus() throws InterruptedException {
        driver.findElement(byStatus).click();
        Thread.sleep(2000);
        driver.findElements(byInactive).get(1).click();
        Thread.sleep(2000);
//        WebElement mySelectedElement = driver.findElement(byStatus);
//        Select dropdown= new Select(mySelectedElement);
//        dropdown.selectByVisibleText("Expired");
    }




}
