package com.blackdog.docker.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blackdog.docker.entity.User;
import com.blackdog.docker.mapper.UserMapper;
import com.blackdog.docker.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author caiyongjian
 * @Description 用户表服务实现
 * @date 2022/5/17
 */
@Service("userService")
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {
}
