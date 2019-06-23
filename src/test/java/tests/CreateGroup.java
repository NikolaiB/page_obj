package tests;

import data.GroupData;
import org.testng.annotations.Test;

public class CreateGroup extends TestBase {

    @Test
    public void testGroupCreation(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test_java", "test header", "test footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().gotoGroupPage();
//        app.logout();
    }

}
