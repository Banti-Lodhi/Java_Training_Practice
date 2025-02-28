package com.app.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataCreate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/CompanyDb";
        String pass = "banti@93682";
        String user = "root";

        //sql query to create database
            String createDatabaseSql = "CREATE DATABASE IF NOT EXISTS CompanyDb";

            //sql query to crate table
          String createTableSQL = "CREATE TABLE IF NOT EXISTS CompanyDb.Employee ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    +"name VARCHAR(255) NOT NULL,"
                    +"position VARCHAR(100),"
                    +"Salary DOUBLE,"
                    +"PRIMARY KEY(id)"
                    + ")";

          Connection connection = null;
          Statement stmnt = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
           connection = DriverManager.getConnection(url, user, pass);
           stmnt = connection.createStatement();

            stmnt.executeUpdate(createDatabaseSql);
            System.out.println("Database 'CompanyDb' created(or already exists)");

            connection.setCatalog("CompanyDb");

            stmnt.executeUpdate(createTableSQL);
            System.out.println("Table 'Employee' created successfully in the 'CompanyDb' database");

        }catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try  {
                if(connection != null) connection.close();
                if(stmnt != null) stmnt.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
