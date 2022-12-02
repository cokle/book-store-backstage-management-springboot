package com.example.bookstorebackstagemanagement.controller;

import com.example.bookstorebackstagemanagement.domain.Book;
import com.example.bookstorebackstagemanagement.mapper.BookMapper;
import com.example.bookstorebackstagemanagement.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookService bookService;

    @PostMapping("/insert")
    public HashMap<String, Object> insert(Book book) {
        HashMap<String, Object> result = new HashMap<>();

        if(0 < bookMapper.insert(book)) {
            result.put("msg", "success");
        }else {
            result.put("msg", "error");
        }

        return result;
    }

    @PostMapping("/delete")
    public HashMap<String, Object> delete(String bookName) {
        HashMap<String, Object> result = new HashMap<>();

        if(bookService.removeByName(bookName))  {
            result.put("msg", "success");
        }else {
            result.put("msg", "error");
        }

        return result;
    }

    @PostMapping("/update")
    public HashMap<String, Object> update(String oldBookName, Book book) {
        HashMap<String, Object> result = new HashMap<>();

        if(bookService.updateByName(oldBookName, book))  {
            result.put("msg", "success");
        }else {
            result.put("msg", "error");
        }

        return result;
    }

    @PostMapping("/select")
    public HashMap<String, Object> select(Book book) {
        HashMap<String, Object> result = new HashMap<>();

        List<Book> books = bookService.selectByEntity(book);

        if(null != books) {
            result.put("msg", "success");
            result.put("books", books);
        }else {
            result.put("msg", "error");
        }

        return result;
    }

}
