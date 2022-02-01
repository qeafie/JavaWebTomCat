package ru.shonin.javawebtomcat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:postgresql://"+ dbHost + ":" + dbPort + "/" +dbName;
        Class.forName("org.postgresql.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUsername,dbPassword);
        return dbConnection;
    }

}
