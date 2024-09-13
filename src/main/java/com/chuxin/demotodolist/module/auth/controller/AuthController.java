package com.chuxin.demotodolist.module.auth.controller;

import groovy.util.logging.Slf4j;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "01.认证中心")
@RestController
@RequestMapping("/api/v1/auth")
@Slf4j
public class AuthController {

    @PostMapping("/login")
    public String login(){
        return "login";
    }

    @Operation(summary = "获取验证码")
    @GetMapping("/captcha")
    public String getCaptcha(){
        return "captcha";
    }
}
