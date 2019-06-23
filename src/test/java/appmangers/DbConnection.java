package appmangers;

import java.sql.*;

public class DbConnection {

    public String name;
    Connection conn = null;
    Statement statement = null;

    public void connectToDb() {

        try {
            System.out.println("Connecting..");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook?" +
                    "user=root&password=");
            statement = conn.createStatement();
            String sql;
            sql = "SELECT group_name FROM group_list WHERE group_id=70";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                name = resultSet.getString("group_name");

                System.out.println(name);
            }

            resultSet.close();
            statement.close();
            conn.close();

        } catch (
                SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}