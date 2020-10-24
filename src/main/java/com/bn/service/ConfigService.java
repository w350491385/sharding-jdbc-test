package com.bn.service;

import com.bn.entity.Config;

import java.util.List;

public interface ConfigService {
    Integer addConfig(Config config);

    List<Config> list();

    void deleteAll();
}
