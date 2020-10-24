package com.bn.service.impl;

import com.bn.entity.UserInfo;
import com.bn.repository.UserInfoRepository;
import com.bn.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoRepository userInfoRepository;

    @Override
    public Integer addUserInfo(UserInfo userInfo) {
        return userInfoRepository.addUserInfo(userInfo);
    }

    @Override
    public List<UserInfo> list() {
        return userInfoRepository.list();
    }

    @Override
    public void deleteAll() {
        userInfoRepository.deleteAll();
    }
}
