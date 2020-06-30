package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class loginObjects {

   WebDriver driver;
   WebDriverWait wait;

    public static By byEmailAddress= By.name("email");
    public static By byPassword= By.name("password");
    //public static By bySignIn= By.cssSelector("#root > div > div > div > div > div.d-flex.flex-column.justify-content-center.login-form > form > button > span.MuiButton-label");
    public static By bySignIn = By.cssSelector("button[type='submit']");
    public static By byLogo = By.className("logo-image");
    public static By byLogout = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/button/span[1]/svg");
    public static By byDashboard= By.cssSelector("div[title='Dashboard']");

    public static String email = "arslan.admin@minimart.ly";
    public static String pwd = "admin123";

    public loginObjects(WebDriver driver,WebDriverWait wait)
    {
        this.driver=driver;
        this.wait=wait;

    }

    public void openLoginPage(String url) throws InterruptedException
    {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(byEmailAddress));

    }

    public void enterDataForLogin(String email, String password) throws InterruptedException
    {
        getEmail(email);
        getPassword(password);
    }

    public void getEmail(String email) throws InterruptedException
    {
        driver.findElement(byEmailAddress).sendKeys(email);

    }

    public void getPassword(String password)throws InterruptedException
    {
        driver.findElement(byPassword).sendKeys(password);
    }

    public void clickSignIn() throws InterruptedException
    {
        driver.findElement(bySignIn).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(byDashboard));

    }

    public void validLogin() throws InterruptedException
    {
        openLoginPage("https://test-admin.minimart.ly/login");
        enterDataForLogin(email,pwd);
        clickSignIn();
    }

    public boolean dashboard() throws InterruptedException
    {
        driver.findElement(byDashboard).isDisplayed();
        return true;
    }

}
