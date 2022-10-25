package com.example.like_lion2.dao;

import com.example.like_lion2.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.*;
import java.util.Map;

public class UserDao {

    public ConnectionMaker connectionMaker;

    public UserDao() {
        this.connectionMaker = new AwsConnectionMaker();
    }

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public void add(User user) throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        try {
            Connection conn = connectionMaker.makeConnection();
//            String dbHost = env.get("DB_HOST");
//            String dbUser = env.get("DB_USER");
//            String dbPassword = env.get("DB_PASSWORD");

//        Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id,name,password) VALUES(?,?,?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getPassword());

            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User findById(String id) throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        Connection c;
        try {
            c = connectionMaker.makeConnection();


            PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE id = ?");
            // PreparedStatement 객체를 통해 SQL을 실행한다.
            // ps에 query 저장 후 DB에 연결 준비
            ps.setString(1, id); //id는 get(String id)로 받은 id

            User user = null;
            ResultSet rs = ps.executeQuery();
            // executeQuery는 ResultSet 객체인 rs변수에 executeQuery값을 저장한다.
            // ResultSet은 executeQuery(String sql)을 통해 쿼리 실행하면 Result타입으로 반환을 해주어 쿼리 실행 결과값을 저장할 수 있다.
            // 결과값을 저장할 수 있다, 저장된 값을 한 행 단위로 불러올 수 있다, 한 행에서 값을 가져올 때는 타입을 지정해 불러 올 수 있다.
            if (rs.next()) {
                user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));

            }
            rs.close();
            ps.close();
            c.close();

            //없으면 exception
            if (user == null) throw new EmptyResultDataAccessException(1);


            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getCount() throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = connectionMaker.makeConnection();
            ps = c.prepareStatement("select count(*) from users");
            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                }
            }
            // executeQuery()는 ResultSet을 반환한다. 결과값을 받아오고 싶을 때 executeQuery()를 쓴다. ex) findById()

        }
    }

    public void deleteAll() throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = connectionMaker.makeConnection();
            ps = c.prepareStatement("DELETE FROM users");
            ps.executeUpdate();
            // int를 반환한다. 결과값이 없는 쿼리를 실행 할 때 쓴다. ex) add()
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                }
            }
        }
    }

        public static void main (String[]args) throws SQLException, ClassNotFoundException {
            UserDao userDao = new UserDao();
            userDao.add(new User("26", "seoyi", "1234"));
//        User user = userDao.findById("5");
//        System.out.println(user.getName());


        }
    }

