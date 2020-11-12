package com.xubo.druid.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xubo.druid.entity.User;


@Mapper
public interface User4LoginDao {

    int addUser(User user);

    User selectUserByName(String name);

    List<User> findAllUser();

    int updateUser(User user);

    int deleteUserById(int id);

}
