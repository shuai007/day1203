package com.broit.day120301.service.impl;

import com.broit.day120301.entity.UserInfo;
import com.broit.day120301.mapper.UserMapper;
import com.broit.day120301.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserInfo> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public UserInfo getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
