package com.xubo.druid.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xubo.druid.entity.User;
import com.xubo.druid.entity.UserInfo;


@Mapper
public interface UserDao {

    int insertUser(UserInfo userInfo);

    UserInfo selectByPre(int id);

    List<UserInfo> listUser();

    int update(UserInfo userInfo);

    int updateUser(User user);

    int deleteByPre(int id);
}
