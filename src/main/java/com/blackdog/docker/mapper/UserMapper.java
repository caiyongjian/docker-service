package com.blackdog.docker.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blackdog.docker.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author caiyongjian
 * @Description
 * @date 2022/5/17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
