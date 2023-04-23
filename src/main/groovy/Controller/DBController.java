package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBController {

    private Connection connection;

    public DBController(Connection connection) {
        this.connection = connection;
    }

    public boolean insertFromAPI(String id, String url, String name, String email, String affiliations) throws SQLException {

        String query = "INSERT INTO autores (author_id, url, name, affiliatios, email) VALUES (?, ?,?,?,?)";
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, id);
        statement.setString(2, url);
        statement.setString(3, name);
        statement.setString(4, affiliations);
        statement.setString(5, email);
        statement.executeUpdate();

        return true;
    }
    public ResultSet selectByID(String id) throws SQLException {
        String query = "SELECT * FROM autores WHERE id = ?";
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, id);
        return statement.executeQuery();
    }
    public ResultSet selectByAuthorID(String id) throws SQLException {
        String query = "SELECT * FROM autores WHERE author_id = ?";
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, id);
        return statement.executeQuery();
    }
    public ResultSet selectByName(String name) throws SQLException {
        String query = "SELECT * FROM autores WHERE name = ?";
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, name);
        return statement.executeQuery();
    }
}
