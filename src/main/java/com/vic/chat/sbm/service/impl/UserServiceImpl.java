package com.vic.chat.sbm.service.impl;

import com.vic.chat.sbm.dao.UserDao;
import com.vic.chat.sbm.domain.User;
import com.vic.chat.sbm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addNewUser(user);
    }

    @Override
    public void delete(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public List<User> retrieveAllUsers() {
        return userDao.retrieveAllUsers();
    }

    @Override
    public User retrieveUserById(int id) {
        return userDao.retrieveUserById(id);
    }
}