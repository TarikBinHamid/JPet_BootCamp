package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DogPage {

    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr/td/a") private List<WebElement> dogNameLinks;
//    @FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a") private WebElement selectItem;


    public void clickDog(String dogName){
        for (WebElement element: dogNameLinks) {
            if (element.getText().equalsIgnoreCase(dogName)){
                element.click();
                break;

            }

        }


    }

}
