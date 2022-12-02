package com.example.bookstorebackstagemanagement.service;

import com.example.bookstorebackstagemanagement.domain.Book;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author ASUS
* @description 针对表【book】的数据库操作Service
* @createDate 2022-11-29 19:40:54
*/
public interface BookService extends IService<Book> {

    List<Book> selectByEntity(Book book);

    boolean removeByName(String bookName);

    boolean updateByName(String bookName, Book book);

}
