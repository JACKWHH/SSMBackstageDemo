package com.wdhcr.mapper;

import com.wdhcr.po.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository(value = "userMapper")
public interface UserMapper {
//    addUser
    void addUser(User user);
//    deleteUser
    void deleteUser(int id);
//    updateUser
    void updateUser(User user);
//    findUserById
    User findUserById(int id);
//    getAllUser
    List<User> getAllUser();
//    updatePassword
    void updatePassword(User user);
}

