package com.bn.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bn.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoRepository  extends BaseMapper<UserInfo> {

    Integer addUserInfo(UserInfo userInfo);

    List<UserInfo> list();

    void deleteAll();
}
