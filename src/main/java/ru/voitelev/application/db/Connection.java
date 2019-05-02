package ru.voitelev.application.db;

import org.sqlite.JDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
    private static final String CON_STR = "jdbc:sqlite:D:/myfin.db";

    private static Connection instance = null;

    public static synchronized Connection getInstance() throws SQLException {
        if (instance == null)
            instance = new Connection();
        return instance;
    }

    private java.sql.Connection connection;

    private Connection() throws SQLException {

        java.sql.DriverManager.registerDriver(new JDBC());

        this.connection = DriverManager.getConnection(CON_STR);
    }

    public String setTextForEnter(String key) {
        String text = "";
        try (Statement statement = this.connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT text FROM text where key==?");
            text = resultSet.getString(key);

        } catch (SQLException ignored) {
            System.out.println("package ru.voitelev.application.db.Connection " + ignored);
        }
        return text;
    }
}

