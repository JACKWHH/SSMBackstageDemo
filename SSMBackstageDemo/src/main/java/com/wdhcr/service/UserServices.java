package com.wdhcr.service;

import com.wdhcr.po.User;

import java.util.List;

/*
*这是service层的规范接口
* */
public interface UserServices {

    //定义user接口规范
    //添加用户
    int addUser(User user);
    //删除用户
    int deleteUser(int id);
    //更新用户
    int updateUser(User user);
    //根据id获取user
    User findUserById(int id);
    //获取所有的用户
    List<User> getAllUser();
    //    updatePassword
    int updatePassword(User user);

}
