package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<User> all = userService.findAll();
        mv.addObject("all",all);
        mv.setViewName("main");
        return mv;
    }
}
