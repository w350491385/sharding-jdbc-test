package com.bn.service;



import com.bn.entity.User;
import com.bn.entity.UserInfo;

import java.util.List;

public interface UserInfoService {

    Integer addUserInfo(UserInfo userInfo);

    List<UserInfo> list();

    void deleteAll();
}
