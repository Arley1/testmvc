package com.dev.service.impl;

import com.dev.entry.User;
import com.dev.mapper.UserMapper;
import com.dev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public List<User> query() {
        return userMapper.query();
    }
}
