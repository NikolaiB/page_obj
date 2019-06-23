package tests;

import appmangers.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeMethod
    public void setUp(){
        app.init();
    }

    @AfterMethod
    public void tearDown(){
        app.stop();
    }

    public ApplicationManager getApp() {
        return app;
    }
}
