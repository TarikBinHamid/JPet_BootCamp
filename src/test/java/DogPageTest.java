import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DogPageTest {
    Browser browser=new Browser();

    @Test
    public void test1(){

        browser.openBrowser().clickLinkElement("DOG");
    }

}
