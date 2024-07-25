package com.chuxin.demotodolist.service;

import com.chuxin.demotodolist.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUserList();

    public Integer deleteUser(Integer id);

    public Integer addUser(User user);

    public Integer updateUser(User user);
}
