package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
//    private UserMapper userMapper;
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.getById(id);
}
    @GetMapping("/findAll")
    public List<User> findAllUsers() {
//        System.out.println(userService.list());
        return userService.list();
//        return null;
    }
    @PostMapping("/add")
    public User addByUser(@RequestBody User user) {
//        System.out.println(user);
        userService.save(user);
        return user;
//        return null;
    }
    @PutMapping("/update")
    public User updateByUser(@RequestBody User user) {
        userService.updateById(user);
//        System.out.println(user);
        return user;
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id) {
        userService.removeById(id);
    }


//    @GetMapping("/findById")
//    public List<User> findById(Integer id){
//        List<User> userList = userService.selectList(null);
//        return userList;
//        }



//    @PostMapping("/addUser")
//    public User addUser(@RequestBody User user){
//        System.out.println(user);
//        return null;
//        return userService.addUser(user);
//
//    }

}
