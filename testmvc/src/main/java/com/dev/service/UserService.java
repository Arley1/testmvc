package com.dev.service;

import com.dev.entry.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> query();
}
