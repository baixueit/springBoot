package com.baixue.test;

import com.baixue.dao.UserDao;
import com.baixue.entity.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

public class UserTest extends BasicTest {
    @Resource
    private UserDao userDao;

    @Test
    public void insertUser(){
        userDao.insert(new User(null, "baixue", "123456", new Date()));
    }
}
