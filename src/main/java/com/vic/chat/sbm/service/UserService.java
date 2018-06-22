package com.vic.chat.sbm.service;

import com.vic.chat.sbm.domain.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void delete(int id);
    void updateUser(User user);
    List<User> retrieveAllUsers();
    User retrieveUserById(int id);
}
