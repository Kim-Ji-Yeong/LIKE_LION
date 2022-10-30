package com.likelion.springpractice.dao;

import com.likelion.springpractice.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class) // Test에서 spring기능을 사용한다고 말해주는 거
@ContextConfiguration(classes = UserDaoFactory.class) // configuration이 여러개일 때 이 테스트에서 쓰고 싶은건 UserDaoFactory라는 것을 말해줌
class UserDaoTest {
    @Autowired
    ApplicationContext context; // context안에는 UserDaoFactory 내용이 들어가있는 거

    UserDao userDao;
    User user1;
    User user2;
    User user3;

    @BeforeEach
    void setUP() throws SQLException {
        userDao = context.getBean("awsUserDao",UserDao.class); // cotext에 담겨 있는 bean을 가져오겠다.
        user1 = new User("1","JiYeong","6415");
        user2 = new User("2","Hana","6415");
        user3 = new User("3","Duri","6415");
        userDao.deleteAll();
    }

    @Test
    void addAndGet() throws SQLException {
//        UserDaoFactory udf = new UserDaoFactory();
//        UserDao userDao = udf.awsUserDao();
//        UserDao userDao = new UserDao(new AwsConnectionMaker());
//        UserDao userDao = context.getBean("awsUserDao",UserDao.classuser1 = new User(new User("2","JiYeong","6415"));
        userDao.add(user1);

//        User user = userDao.get("1");
//        assertEquals("JiYeong",user.getName());
//
//        assertThrows(EmptyResultDataAccessException.class,()->{
//            userDao.get("2");
//        });


        userDao.deleteAll();
    }

    @Test
    void getCount() throws SQLException {
        assertEquals(0,userDao.getCount());

        userDao.add(user1);
        assertEquals(1,userDao.getCount());

        userDao.add(user2);
        assertEquals(2,userDao.getCount());

        userDao.add(user3);
        assertEquals(3,userDao.getCount());

        userDao.deleteAll();
    }

    @Test
    void getAll(){
        userDao.add(user1);
        userDao.add(user2);
        userDao.add(user3);

        List<User> users = userDao.getAll();
        assertEquals(3,users.size());
    }
}