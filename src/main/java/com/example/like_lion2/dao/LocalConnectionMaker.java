package com.example.like_lion2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class LocalConnectionMaker implements  ConnectionMaker{

    @Override
    public Connection makeConnection() throws SQLException {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/likelion",
                    "root",
                    "12345678");
            return c;
    }
}
