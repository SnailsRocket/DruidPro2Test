package com.xubo.druid.service;

import java.util.List;

import com.xubo.druid.entity.User;
import com.xubo.druid.entity.UserInfo;


/**
 * @Author Druid_Xu
 * @Description TODO
 * @Date 2020/8/14 下午 04:14
 */
public interface UserService {
    public List<UserInfo> findAll();

    public int insertOne(UserInfo userInfo);

    public UserInfo findByPre(int id);

    public int updateUser(UserInfo userInfo);

    public int updateUserDB(User user);

    public int deleteUserByOne(int id);

}
