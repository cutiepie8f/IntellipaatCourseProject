package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class LoginPage extends BaseCode {
    public static void enterMailId()
    {
driver.findElement(By.xpath("//input[@type='email']")).sendKeys(prob.getProperty("email"));
    }

    public static void enterPassword()
    {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prob.getProperty("password"));
    }

    public static void clickContinueButton()
    {
       driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    public static void clickSigninButton()
    {
driver.findElement(By.id("signInSubmit")).click();
    }

    public static String getLoginTitle()
    {

        return driver.getTitle();
    }

}
