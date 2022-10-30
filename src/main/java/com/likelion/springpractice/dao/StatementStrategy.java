package com.likelion.springpractice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StatementStrategy {
    PreparedStatement getStatement(Connection c) throws SQLException;
}
