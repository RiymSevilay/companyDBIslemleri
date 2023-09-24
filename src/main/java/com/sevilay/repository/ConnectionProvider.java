package com.sevilay.repository;

import java.sql.*;


public class ConnectionProvider {

    String connectionString = "jdbc:postgresql://localhost:5432/companyDB";
    String username = "postgres";
    String password = "root";

    Connection connection;
    PreparedStatement preparedStatement;

    ResultSet resultSet;

    public boolean openConnection() {
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean closeConnection() {
        try {
            if (!connection.isClosed()) {
                connection.close();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean executeUpdate(String sqlQuery) {
        if(openConnection()){
            try {
                preparedStatement=connection.prepareStatement(sqlQuery);
                preparedStatement.executeUpdate();
                closeConnection();
                return true;
            }catch (SQLException e) {
                closeConnection();
            }
        }
        return false;
    }


}

