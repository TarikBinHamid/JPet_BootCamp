package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ShoppingCart {
    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a") private WebElement value;

    WebDriver driver= Browser.getDriver();

    public ShoppingCart validateCart(){

        String actualValue=value.getText();
        Assert.assertEquals(actualValue,value.getText());
        return this;
    }

}
