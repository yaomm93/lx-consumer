package com.powerlbs.controllers;

import com.powerlbs.bean.User;
import com.powerlbs.service.FindService;
import com.powerlbs.service.impl.FindServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:${name}
 * package:com.powerlbs.controllers
 *
 * @date:2019/10/1 22:46
 * @author:Yaoxiaoming
 **/
@Controller
public class FindController {
    @Autowired
    private FindService findService;

    @RequestMapping("/find")
    public ModelAndView FindAll(){
        ModelAndView mv = new ModelAndView();
        List<User> userList = new ArrayList<>();
        userList = findService.findUser();
       mv.addObject("userList",userList);
       mv.setViewName("index");
        return mv;

    }
}
