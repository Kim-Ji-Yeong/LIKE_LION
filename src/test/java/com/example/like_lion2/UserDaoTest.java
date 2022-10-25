package com.example.like_lion2;

import com.example.like_lion2.dao.UserDao;
import com.example.like_lion2.dao.UserDaoFactory;
import com.example.like_lion2.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;


    UserDao userDao;
    User user1;
    User user2;
    User user3;

    @BeforeEach
    // 각 @Test 메소드가 실행 될 떄마다 실행되는 코드가 있습니다. 그 부분을 Junit에서 공통화 시킬 수 있게
    // 제공하는 기능이 BeforeEach입니다.
    void setUp(){
        this.userDao = context.getBean("awsUserDao",UserDao.class);
        this.user1 = new User("1","Hana","1111");
        this.user2 = new User("2","Duri","2222");
        this.user3 = new User("3","Seoyi","3333");
    }

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        User user1 = new User("1","Hana","1111");

        userDao.deleteAll();
        Assertions.assertEquals(0,userDao.getCount());

        userDao.add(user1);
        Assertions.assertEquals(1,userDao.getCount());
        User user = userDao.findById(user1.getId());

        Assertions.assertEquals(user1.getName(),user.getName());
        Assertions.assertEquals(user1.getPassword(),user.getPassword());
    }

    @Test
    void count() throws SQLException, ClassNotFoundException {

        userDao.deleteAll();
        Assertions.assertEquals(0,userDao.getCount());

        userDao.add(user1);
        Assertions.assertEquals(1,userDao.getCount());
        userDao.add(user2);
        Assertions.assertEquals(2,userDao.getCount());
        userDao.add(user3);
        Assertions.assertEquals(3,userDao.getCount());
    }

    @Test
    void findById(){
        assertThrows(EmptyResultDataAccessException.class, () -> {
            userDao.findById("30");
        });
    }
}