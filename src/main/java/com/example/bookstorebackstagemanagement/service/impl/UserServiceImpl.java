package com.example.bookstorebackstagemanagement.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bookstorebackstagemanagement.domain.User;
import com.example.bookstorebackstagemanagement.service.UserService;
import com.example.bookstorebackstagemanagement.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-11-29 19:40:48
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, username)
                        .eq(User::getPassword, password);

        return userMapper.selectOne(wrapper);
    }
}




