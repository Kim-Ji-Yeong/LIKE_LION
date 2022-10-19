package com.line.readlineparser.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    void addAndSelect(){
        AWSUserDaoImpl userDao = new AWSUserDaoImpl();
        String id =  "11";
        userDao.add(new User(id,"Rara","112233"));
        User user = userDao.findById(id);
        Assertions.assertEquals("Rara",user.getName());
    }
}
