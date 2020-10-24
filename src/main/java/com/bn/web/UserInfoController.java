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
public class UserInfoController {

    Logger logger= LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/userInfos")
    public Object list() {
        List<UserInfo> list= userInfoService.list();
        return list;
    }

    @GetMapping("/userInfo/add")
    public Object add() {
        for(int i=1;i<101;i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setId(new Long(i));
            userInfo.setAddress("address " + i);
            userInfo.setMobile("mobile " + i);
            userInfo.setUserId(i);
            userInfoService.addUserInfo(userInfo);
        }
        return "ok";
    }

    @GetMapping("/userInfo/delete")
    public Object delete() {
        userInfoService.deleteAll();
        return "ok";
    }
}
