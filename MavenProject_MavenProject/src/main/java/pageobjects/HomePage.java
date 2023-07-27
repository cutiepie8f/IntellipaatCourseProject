package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;


public class HomePage extends BaseCode {
   private static Select currencyDropdown;
    public static void enterProduct(String productName)
    {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(productName);
    }

    public static void clickSearchIcon()
    {
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public static void clickLoginButton()
    {
        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
    }

    public static void selectByIndex(int index)
    {
        initializeStaticDropdown();
        currencyDropdown.selectByIndex(index);
    }
    public static void selectByValue(String value)
    {
        initializeStaticDropdown();
        currencyDropdown.selectByValue(value);
    }
    public static void  selectByText(String value)
    {
        initializeStaticDropdown();
        currencyDropdown.selectByVisibleText(value);
    }

    public static void initializeStaticDropdown()
    {
        WebElement currencyElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        currencyDropdown = new Select(currencyElement );
    }
}
