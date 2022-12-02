package com.example.bookstorebackstagemanagement.mapper;

import com.example.bookstorebackstagemanagement.domain.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ASUS
* @description 针对表【book】的数据库操作Mapper
* @createDate 2022-11-29 19:40:54
* @Entity com.example.bookstorebackstagemanagement.domain.Book
*/
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}




