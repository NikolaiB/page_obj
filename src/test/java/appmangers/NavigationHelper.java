package appmangers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;

    public void gotoGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }
}
