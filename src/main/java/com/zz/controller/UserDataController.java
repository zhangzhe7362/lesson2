package com.zz.controller;

import com.zz.entity.User;
import com.zz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserDataController {

    @Autowired  // 根据类型注入
    private UserService userService;

    @PostMapping(value="/")
    public User save(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping(value="/")
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String delete(@PathVariable Long id) {
        userService.deleteById(id);
        return "删除成功";
    }

    @GetMapping(value = "/id/{id}")
    public User findById (@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping(value = "/name/{username}")
    public User findByUsername (@PathVariable String username) {
        return userService.getByUserName(username);
    }

    @GetMapping(value = "/list")
    public List<User> findAll () {
        return userService.queryAll();
    }
}
