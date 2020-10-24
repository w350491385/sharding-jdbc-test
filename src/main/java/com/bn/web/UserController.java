package com.bn.web;


import com.bn.entity.User;
import com.bn.entity.UserInfo;
import com.bn.service.UserInfoService;
import com.bn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/users")
    public Object list() {
        List<User> list= userService.list();
        return list;
    }

    @GetMapping("/add")
    public Object add() {

        for(int i=1;i<101;i++) {
            User user = new User();
            user.setId(i);
            user.setUsername("forezp"+(i));
            user.setPassword("1233edwd");
           long resutl=   userService.addUser(user);
            UserInfo userInfo = new UserInfo();
            userInfo.setId(Long.valueOf(i+""));
            userInfo.setAddress("address " + i);
            userInfo.setMobile("mobile " + i);
            userInfo.setUserId(i);
            userInfoService.addUserInfo(userInfo);
        }
        return "ok";
    }

    @GetMapping("/delete")
    public Object delete() {
        userService.deleteAll();
        return "ok";
    }
}
