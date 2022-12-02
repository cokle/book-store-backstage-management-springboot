package com.example.bookstorebackstagemanagement.controller;

import com.example.bookstorebackstagemanagement.domain.User;
import com.example.bookstorebackstagemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.HandshakeRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Map<String, Object> login(String username, String password){
        Map<String, Object> result = new HashMap<>();

        User user = userService.login(username, password);

        if(null != user) {
            result.put("msg", "success");
        }else {
            result.put("msg", "error");
        }

        return result;
    }
}
