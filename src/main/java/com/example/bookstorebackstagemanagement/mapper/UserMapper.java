package com.example.bookstorebackstagemanagement.mapper;

import com.example.bookstorebackstagemanagement.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ASUS
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-11-29 19:40:48
* @Entity com.example.bookstorebackstagemanagement.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




