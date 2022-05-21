package com.blackdog.docker.controller;

import com.blackdog.docker.entity.User;
import com.blackdog.docker.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author caiyongjian
 * @date 2022/5/17
 */
@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("listAll")
    public List<User> listAll() {
        return userService.list(null);
    }

}
