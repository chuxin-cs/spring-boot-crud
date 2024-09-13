package com.chuxin.demotodolist.system.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "02.用户接口")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {


    @Operation(summary = "获取当前登录用户信息")
    @GetMapping("/me")
    public String getCurrentUserInfo() {
        return "获取当前登录用户信息";
    }



}
