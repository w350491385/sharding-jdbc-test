package com.bn.repository;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bn.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository  extends BaseMapper<User> {

    Integer addUser(User user);

    List<User> list();

    void deleteAll();

}

