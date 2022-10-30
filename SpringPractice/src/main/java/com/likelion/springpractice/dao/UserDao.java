package com.likelion.springpractice.dao;

import com.likelion.springpractice.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
import java.util.Map;

public class UserDao {

    private ConnectionMaker connectionMaker;

    private DataSource dataSource;

    private JdbcContext jdbcContext;

    private JdbcTemplate jdbcTemplate;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcContext = new JdbcContext(dataSource);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

//    public void jdbcContextWithStatementStrategy(StatementStrategy st){
//        Connection c = null;
//        PreparedStatement ps = null;
//        try {
//            c = dataSource.getConnection();
//            ps = st.getStatement(c);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (ps != null) {
//                try {
//                    ps.close();
//                } catch (SQLException e) {
//
//                }
//            }
//            if (ps != null) {
//                try {
//                    c.close();
//                } catch (SQLException e) {
//
//                }
//            }
//        }
//    }

    public void add(User user)  {
        jdbcTemplate.update("INSERT INTO users(id,name,password)VALUES (?,?,?)",user.getId(),user.getName(),user.getPassword());
//        jdbcContext.workWithStatementStrategy(new StatementStrategy() {
//          @Override
//          public PreparedStatement getStatement(Connection c) throws SQLException {
//              PreparedStatement ps = c.prepareStatement("INSERT INTO users(id,name,password) VALUES (?,?,?)");
//              ps.setString(1,user.getId());
//              ps.setString(2,user.getName());
//              ps.setString(3,user.getPassword());
//              return ps;
//          }
//      });
    }

    RowMapper<User> rowMapper = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User(rs.getString("id"),rs.getString("name"),rs.getString("password"));
            return user;
        }
    };


    public User get(String id) throws SQLException {
        String sql = "SELECT * FROM users where id= ?";
        return jdbcTemplate.queryForObject(sql,rowMapper,id);
//        Connection c = connectionMaker.getConnection();
//
//        PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
//        ps.setString(1,id);
//
//        ResultSet rs = ps.executeQuery();
//        User user = null;
//
//        if(rs.next()){
//            user = new User(rs.getString("id"),rs.getString("name"),rs.getString("password"));
//        }
//        rs.close();
//        ps.close();
//        c.close();
//
//        if(user == null){
//            throw new EmptyResultDataAccessException(1);
//        }
//
//        return user;
    }

    public void deleteAll() {
//            jdbcContext.excuteSql("DELETE FROM users");
            jdbcTemplate.update("DELETE FROM users");
        }

        public int getCount() throws SQLException {
            return jdbcTemplate.queryForObject("SELECT count(*) FROM users",Integer.class);
//        Connection c = connectionMaker.getConnection();
//
//        PreparedStatement ps = c.prepareStatement("SELECT count(*) FROM users");
//        ResultSet rs = ps.executeQuery();
//        rs.next();
//
//        int cnt = rs.getInt(1);
//
//        rs.close();
//        ps.close();
//        c.close();
//
//        return cnt;
        }

        public List<User> getAll(){
        String sql = "SELECT * FROM users order by id";
        return jdbcTemplate.query(sql,rowMapper);
        }
}
