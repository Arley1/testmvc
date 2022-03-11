package com.dev.controller;

import com.dev.entry.User;
import com.dev.service.UserService;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/hello")
    @ResponseBody
    String hello(){
        return "hello";
    }

    @RequestMapping(value = "/addUser",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String addUser(User user,@RequestParam(value = "username",required = false) String username){
        System.out.println(user.toString());

        return "success";
    }

    @RequestMapping(value = "/insertUser",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String insertUser(@RequestBody User user){
        System.out.println(user);
        userService.addUser(user);
        return "insert user success";
    }

    @RequestMapping(value = "/query")
    @ResponseBody
    public List<User> query(){
        List<User> users = userService.query();
        return users;
    }
}
