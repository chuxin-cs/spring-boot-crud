package com.chuxin.demotodolist.service.impl;

import com.chuxin.demotodolist.entity.User;
import com.chuxin.demotodolist.mapper.UserMapper;
import com.chuxin.demotodolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
