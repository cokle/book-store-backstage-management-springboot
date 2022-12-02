package com.example.bookstorebackstagemanagement.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bookstorebackstagemanagement.domain.Book;
import com.example.bookstorebackstagemanagement.service.BookService;
import com.example.bookstorebackstagemanagement.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author ASUS
* @description 针对表【book】的数据库操作Service实现
* @createDate 2022-11-29 19:40:54
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectByEntity(Book book) {
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();

        if(null != book.getId() && !"".equals(book.getId())) wrapper.eq(Book::getId, book.getId());
        if(null != book.getBookName() && !"".equals(book.getBookName())) wrapper.eq(Book::getBookName, book.getBookName());
        if(null != book.getPrice() && !"".equals(book.getPrice())) wrapper.eq(Book::getPrice, book.getPrice());
        if(null != book.getStock() && !"".equals(book.getStock())) wrapper.eq(Book::getStock, book.getStock());

        return bookMapper.selectList(wrapper);
    }

    @Override
    public boolean removeByName(String bookName) {
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();

        wrapper.eq(Book::getBookName, bookName);

        return 0 < bookMapper.delete(wrapper);
    }

    @Override
    public boolean updateByName(String bookName, Book book) {
        LambdaQueryWrapper<Book> wrapper = new LambdaQueryWrapper<>();

        wrapper.eq(Book::getBookName, bookName);

        return 0 < bookMapper.update(book, wrapper);
    }
}




