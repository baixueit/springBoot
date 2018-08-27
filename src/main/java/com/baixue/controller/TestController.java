package com.baixue.controller;

import com.baixue.entity.User;
import com.baixue.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class TestController {
    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("test controller");
        return "success";
    }

    @RequestMapping("/toIndex")
    public String toIndex(){
        List<User> list = userService.queryAll();
        for (User user : list) {
            System.out.println(user);
        }
        System.out.println("jrebel test test =========== ");
        System.out.println("+++++================index==============");
        return "index";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(){
        userService.save(new User(null, "baixue", "123456", new Date()));

        return "success";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        userService.deleteUser("a98cf58ca60411e8aa432089849f9cef");
        return "success";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(){
        userService.updateUser(new User("225cb6bea5ba11e8aa432089849f9cef", "baixue", "6554321", new Date()));
        return "success";
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public String selectById(){
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        User user = userService.queryById("225cb6bea5ba11e8aa432089849f9cef");
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/testGit")
    public String testGit(){
        System.out.println("git test");
        return "index";
    }

}
