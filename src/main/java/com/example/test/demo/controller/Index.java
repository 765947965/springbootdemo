package com.example.test.demo.controller;

import com.example.test.demo.mysql.dao.TestConfigService;
import com.example.test.demo.mysql.dao.UserDao;
import com.example.test.demo.mysql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    @Autowired
    TestConfigService service;

    @Autowired
    private UserDao userDao;

    @RequestMapping("/")
    public String index(@RequestParam String userName, String password, String phone) {
        User user = new User(userName, password, phone);
        userDao.insert(user);
        return userDao.selectUsers().toString() + service.toConfig();
    }

    @RequestMapping("/add")
    public String add(@RequestParam String userName, String password, String phone) {
        User user = new User(userName, password, phone);
        userDao.insert(user);
        return userDao.selectUsers().toString();
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam Integer userId) {
        userDao.deleteUserById(userId);
        return userDao.selectUsers().toString();
    }

    @RequestMapping("/upData")
    public String upData(@RequestParam Integer userId, String userName, String password, String phone) {
        User user = new User(userName, password, phone);
        user.setUserId(userId);
        userDao.updateUser(user);
        return userDao.selectUsers().toString();
    }
}
