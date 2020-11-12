package com.xubo.druid.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xubo.druid.dao.UserDao;
import com.xubo.druid.entity.User;
import com.xubo.druid.entity.UserInfo;
import com.xubo.druid.service.UserService;


/**
 * @Author Druid_Xu
 * @Description TODO
 * @Date 2020/8/14 下午 04:14
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> res_User = userDao.listUser();
        return res_User;
    }

    @Override
    public int insertOne(UserInfo userInfo) {
        return userDao.insertUser(userInfo);
    }

    @Override
    public UserInfo findByPre(int id) {
        return userDao.selectByPre(id);
    }

    @Override
    public int updateUser(UserInfo userInfo) {
        return userDao.update(userInfo);
    }

    @Override
    public int updateUserDB(User user) {
        int i = userDao.updateUser(user);
        return i;
    }

    @Override
    public int deleteUserByOne(int id) {
        return userDao.deleteByPre(id);
    }

}
