package tests;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    @Test
    public void testUntitledTestCase(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getNavigationHelper().gotoGroupPage();
    }
}
