package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testtt {


    @Test
    public void testArea() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
