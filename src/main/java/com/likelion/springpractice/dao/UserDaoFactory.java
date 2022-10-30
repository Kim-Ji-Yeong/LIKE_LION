package com.likelion.springpractice.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.util.Map;

@Configuration //UserDaoFactory안에 있는 것을 스프링에서 사용한다고 말해주는 거
public class UserDaoFactory {

    @Bean // 그 안에는 awsUserDao라는 게 있다고 Bean을 통해서 알려주는 거임
    public UserDao awsUserDao(){
        return new UserDao(awsdataSource());
    }

    DataSource awsdataSource(){
        Map<String,String> env = System.getenv();
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl(env.get("DB_HOST"));
        dataSource.setUsername(env.get("DB_NAME"));
        dataSource.setPassword(env.get("DB_PASSWORD"));

        return dataSource;
    }
}
