package mysql.labs;

/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
*/

import java.sql.*;

public class Exercise_04 {
    public static void main(String[] args) {
        MySQL mysql = new MySQL();
        String query;

        // Flight queries
        query = "SELECT * FROM Flight;";
        mysql.query(query);

        query = "INSERT INTO Flight ";
        query += "(airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime) ";
        query += "VALUES (1, 2, 3, 2, '2026-01-02', '01:00:00', '2026-01-03', '06:00:15');";
        mysql.add(query);

        query = "UPDATE Flight SET arrivalDate = '2026-01-04', arrivalTime = '07:14:00' WHERE id = 15;";
        mysql.update(query);

        query = "DELETE FROM Flight WHERE id = 16;";
        mysql.delete(query);

        // Passenger queries
        query = "SELECT * FROM Passenger;";
        mysql.query(query);

        query = "INSERT INTO Passenger (firstName, lastName) VALUES ('Johnny', 'Cash');";
        mysql.add(query);

        query = "UPDATE Passenger SET firstName = 'John' WHERE firstName = 'Johnny' AND lastName = 'Cash'";
        mysql.update(query);

        query = "DELETE FROM Passenger WHERE firstName = 'Johnny' AND lastName = 'Cash'";
        mysql.delete(query);
    }
}

class MySQL {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    private void initializeDB(String query) {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String url = "jdbc:mysql://localhost/airtravel";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void query(String query) {
        initializeDB(query);
        try {
            resultSet = statement.executeQuery(query);
            System.out.println("query completed: " + query);
            if (resultSet == null) throw new SQLException();
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                System.out.println("id:" + id);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            close();
        }
    }

    public void add(String query) {
        initializeDB(query);
        try {
            statement.executeUpdate(query);
            System.out.println("query completed: " + query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        } finally {
            close();
        }
    }

    public void update(String query) {
        initializeDB(query);
        try {
            statement.executeUpdate(query);
            System.out.println("query completed: " + query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        } finally {
            close();
        }
    }

    public void delete(String query) {
        initializeDB(query);
        try {
            statement.executeUpdate(query);
            System.out.println("query completed: " + query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        } finally {
            close();
        }
    }

    private void close() {
        try {
            if (resultSet != null) { resultSet.close(); }
            if (statement != null) { statement.close(); }
            if (connection != null) { connection.close(); }
        } catch (Exception e) {
            System.out.println("Could not close database resources");
        }
    }
}
