package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
//    通过 @Autowired 注入了 UserMapper
//    @Autowired
//    private UserMapper userMapper;
//    @Override
//    public User findById(Integer id) {
//        return  userMapper.findById(id);
//    }

//    @Override
//    public User addUser(@RequestBody User user){
////        return  userMapper.insertUser(user);
//        return null;
//    }
}
