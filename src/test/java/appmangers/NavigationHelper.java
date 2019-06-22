package appmangers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public NavigationHelper(WebDriver driver) {

        this.driver = driver;
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }
}
