package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginObjects {

    WebDriver driver;
   // WebDriverWait wait;

    public static By byEmailAddress= By.name("email");
    public static By byPassword= By.name("password");
    //public static By bySignIn= By.cssSelector("#root > div > div > div > div > div.d-flex.flex-column.justify-content-center.login-form > form > button > span.MuiButton-label");
    public static By bySignIn = By.cssSelector("button[type='submit']");
    public static By byLogo = By.className("logo-image");

    public loginObjects(WebDriver driver)
    {
        this.driver=driver;
        //this.wait=wait;
    }

    public void openLoginPage(String url) throws InterruptedException
    {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    public void enterDataForLogin(String email, String password) throws InterruptedException
    {
        getEmail(email);
        Thread.sleep(1000);
        getPassword(password);
        Thread.sleep(1000);

    }

    public void getEmail(String email) throws InterruptedException
    {
        driver.findElement(byEmailAddress).sendKeys(email);
        Thread.sleep(2000);
    }

    public void getPassword(String password)throws InterruptedException
    {
        driver.findElement(byPassword).sendKeys(password);
        Thread.sleep(2000);
    }

    public void clickSignIn() throws InterruptedException
    {
        driver.findElement(bySignIn).click();
        Thread.sleep(2000);
    }

    public boolean logoImage() throws InterruptedException
    {
        driver.findElement(byLogo).isDisplayed();
        Thread.sleep(2000);
        return true;
    }

}
