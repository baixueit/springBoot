package com.baixue.service;

import com.baixue.dao.UserDao;
import com.baixue.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserDao userDao;

    public void save(User user) {
        userDao.insert(user);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> queryAll() {
        return userDao.selectAll();
    }

    public void deleteUser(String id) {
        userDao.delete(id);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public User queryById(String id) {

        logger.info("info ===service");
        logger.debug("debug ===service");
        logger.error("error ===service");
        logger.warn("warn ===service");
        User user = userDao.selectById(id);
        return user;
    }
}
