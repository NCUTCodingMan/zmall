package com.rain.service;

import com.rain.mapper.UserMapper;
import com.rain.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rain
 * created on 2018/3/31
 */
@Service("userService")
public class UserService {
    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    public User getUserByUserId(Integer id) {
        return userMapper.getUserByUserId(id);
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}