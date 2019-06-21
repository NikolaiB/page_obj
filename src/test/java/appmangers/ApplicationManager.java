package appmangers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private WebDriver driver;

    private final NavigationHelper navigationHelper = new NavigationHelper();
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;

    public void init() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook");
        groupHelper = new GroupHelper(driver);
        sessionHelper.login("admin", "secret");
        sessionHelper = new SessionHelper(driver);
    }

    public void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
