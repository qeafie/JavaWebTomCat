package ru.shonin.javawebtomcat;

import java.sql.*;


public class DataBaseHandler extends Configs{
    private static DataBaseHandler instance;
    Connection dbConnection;

    private DataBaseHandler(){
    }

    public static DataBaseHandler getDataBaseHandler(){
        if (instance==null)
            instance = new DataBaseHandler();
        return instance;
    }

    public Connection getDbConnection() throws ClassNotFoundException, SQLException{

        if (dbConnection == null) {
            String connectionString = "jdbc:postgresql://"+ dbHost + ":" + dbPort + "/" +dbName;
            Class.forName("org.postgresql.Driver");

            dbConnection = DriverManager.getConnection(connectionString, dbUsername,dbPassword);
        }

        return dbConnection;
    }

    public void registerUser(User user)  {
        String insert = "INSERT INTO " + TableFields.USER_TABLE + " (" + TableFields.USERS_NAME + ", "
                + TableFields.USERS_SURNAME + ", " + TableFields.USERS_EMAIL + ", " + TableFields.USERS_PASSWORD + ", "
                + TableFields.USERS_BIRTHDAY + ")"
                + "VALUES (?,?,?,?,?)" ;



        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getSurname());
            preparedStatement.setString(3,user.getEmail());
            preparedStatement.setString(4,user.getPassword());


            preparedStatement.setDate(5,java.sql.Date.valueOf(user.getBirthday()));
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean isNewUser(User user){

        try {
            Statement statement = getDbConnection().createStatement();
            ResultSet resultSet =  statement.executeQuery("SELECT " + TableFields.USERS_EMAIL.toString() + " FROM " + TableFields.USER_TABLE.toString());

            while (resultSet.next()){
                if(user.getEmail().equals(resultSet.getString(TableFields.USERS_EMAIL.toString())))
                    return false;
            }


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }
}
