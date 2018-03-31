package com.rain.web;

import com.rain.pojo.User;
import com.rain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rain
 * created on 2018/3/31
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserByUserId(@PathVariable("id") Integer id) {
        return userService.getUserByUserId(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Integer saveUser(@ModelAttribute User user) {
        return userService.saveUser(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUserList() {
        return userService.getUserList();
    }
}