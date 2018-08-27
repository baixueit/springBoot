package com.baixue.service;

import com.baixue.entity.User;

import java.util.List;

public interface UserService {
    public void save(User user);

    public List<User> queryAll();

    public void deleteUser(String id);

    public void updateUser(User user);

    public User queryById(String id);
}
