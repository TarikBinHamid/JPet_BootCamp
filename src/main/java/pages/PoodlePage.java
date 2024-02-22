package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class PoodlePage {
    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a") private WebElement selectItem;
    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a") private WebElement selPcart;


    WebDriver driver= Browser.getDriver();
    public PoodlePage selectPoodle(){
        selectItem.click();
        return this;
    }
    public ShoppingCart selectPoodleCart(){
        selPcart.click();
        return PageFactory.initElements(driver,ShoppingCart.class);

    }


}
