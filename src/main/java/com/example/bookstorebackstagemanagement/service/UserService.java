package com.example.bookstorebackstagemanagement.service;

import com.example.bookstorebackstagemanagement.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author ASUS
* @description 针对表【user】的数据库操作Service
* @createDate 2022-11-29 19:40:48
*/
public interface UserService extends IService<User> {

    User login(String username, String password);

}
