package tut01;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class MySQLConnect {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/tut1";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "tuanzx2002";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("successfully");
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM course";
            String query2 = "SELECT * FROM faculty";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("List Courses");
            while (resultSet.next()) {
                System.out.println("courseID: " + resultSet.getString(1));
                System.out.println("courseName: " + resultSet.getString(2));
                System.out.println("----------------------------");
            }
            ResultSet resultSet2 = statement.executeQuery(query2);
            System.out.println("List Faculty");
            while (resultSet2.next()) {
                System.out.println("facultyID: " + resultSet2.getString(1));
                System.out.println("facultyName: " + resultSet2.getString(2));
                System.out.println("-----------------------------");
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
