package com.wdhcr.service;

import com.wdhcr.mapper.UserMapper;
import com.wdhcr.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
* service的实现类
* */
@Service(value = "userServicesImp")
public class UserServicesImp implements UserServices {
    //使用注解的方式注入userMapper
    @Resource(name = "userMapper")
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        userMapper.addUser(user);
        return 1;

    }

    @Override
    public int deleteUser(int id) {
        userMapper.deleteUser(id);
        return 1;
    }

    @Override
    public int updateUser(User user) {
        userMapper.updateUser(user);
        return 1;
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public int updatePassword(User user) {
        userMapper.updatePassword(user);
        return 1;

    }
}
