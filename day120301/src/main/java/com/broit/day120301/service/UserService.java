package com.broit.day120301.service;


import com.broit.day120301.entity.UserInfo;

import java.util.List;


public interface UserService {
    List<UserInfo> getUserList();

    UserInfo getUserById(Integer id);

    void deleteUserById(Integer id);
}
