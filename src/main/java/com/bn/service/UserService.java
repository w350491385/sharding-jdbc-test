package com.bn.service;



import com.bn.entity.User;

import java.util.List;

public interface UserService {

    Integer addUser(User user);

    List<User> list();

    void deleteAll();
}
