package appmangers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private WebDriver driver;

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;

    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {

        if (browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        }
        else if (browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }

        sessionHelper = new SessionHelper(driver);
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook");
        sessionHelper.login("admin", "secret");
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