package com.baixue.test;

import com.baixue.entity.User;
import com.baixue.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestUserService extends BasicTest {
    @Resource
    private UserService userService;

    @Test
    public void save(){
        List<User> list = userService.queryAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
