package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestBody;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    public User findById(Integer id);

//    public User addUser(@RequestBody User user);
}
