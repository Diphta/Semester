/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author philip
 */
public class Database {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_USR = "root";
    private static final String DATABASE_PWD = "root";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306";
    private static final String SCHEMA = "/film";
    private static String str =  "";
    private static Connection con;
    private Connection db;
    
    private Database() {
        
    }
    
    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(DATABASE_URL + SCHEMA,
                DATABASE_USR, DATABASE_PWD);
    }

    public Connection getDb() {
        if (db == null) {
            Database db = new Database();
        }
        return db;
    }
    
    
}
