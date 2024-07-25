package com.chuxin.demotodolist.controller;

import com.chuxin.demotodolist.entity.User;
import com.chuxin.demotodolist.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@Tag(name = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUserList")
    @Operation(summary = "获取用户列表")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping("deleteUser")
    @Operation(summary = "删除用户")
    public Integer deleteUser(@RequestBody User user) {
        return userService.deleteUser(user.getId());
    }

    @PostMapping("addUser")
    @Operation(summary = "新增用户")
    public Integer addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PostMapping("updateUser")
    @Operation(summary = "更新用户")
    public Integer updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
