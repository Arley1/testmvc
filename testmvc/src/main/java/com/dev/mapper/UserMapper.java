package com.dev.mapper;

import com.dev.entry.User;

import java.util.List;

public interface UserMapper {
    public void addUser(User user);
    List<User> query();
}
