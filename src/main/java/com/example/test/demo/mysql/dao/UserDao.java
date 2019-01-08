package com.example.test.demo.mysql.dao;

import com.example.test.demo.mysql.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    int insert(User record);

    void deleteUserById(@Param("userId") Integer userId);

    void updateUser(User userDomain);

    List<User> selectUsers();
}
