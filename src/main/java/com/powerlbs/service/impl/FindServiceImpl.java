package com.powerlbs.service.impl;

import com.powerlbs.bean.User;
import com.powerlbs.service.FindService;
import com.powerlbs.service.UserService;

import java.util.List;

/**
 * ClassName:${name}
 * package:com.powerlbs.service.impl
 *
 * @date:2019/10/1 23:19
 * @author:Yaoxiaoming
 **/
public class FindServiceImpl implements FindService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public List<User> findUser() {
        List<User> userList = userService.selectUserInfo();
        return userList;
    }
}
