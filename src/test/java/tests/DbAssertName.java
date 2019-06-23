package tests;

import appmangers.DbConnection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DbAssertName {

    @Test
    public void extractAndCompareNames() {
        DbConnection dbConnection = new DbConnection();
        dbConnection.connectToDb();
        Assert.assertEquals(dbConnection.name, "test_2");
    }
}