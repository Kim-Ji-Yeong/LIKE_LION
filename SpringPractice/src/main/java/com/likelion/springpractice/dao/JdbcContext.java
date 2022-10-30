package com.likelion.springpractice.dao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcContext {

    private DataSource dataSource;

    public JdbcContext(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void excuteSql(String sql){
        workWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement getStatement(Connection c) throws SQLException {

                return c.prepareStatement(sql);
            }
        });
    }

    public void workWithStatementStrategy(StatementStrategy st){
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = dataSource.getConnection();
            ps = st.getStatement(c);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {

                }
            }
            if (ps != null) {
                try {
                    c.close();
                } catch (SQLException e) {

                }
            }
        }
    }
}
