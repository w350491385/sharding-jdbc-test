package com.bn.service.impl;

import com.bn.entity.Config;
import com.bn.repository.ConfigRepository;
import com.bn.service.ConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConfigServiceImpl implements ConfigService {

    @Resource
    ConfigRepository configRepository;

    @Override
    public Integer addConfig(Config config) {
        return configRepository.addConfig(config);
    }

    @Override
    public List<Config> list() {
        return configRepository.list();
    }

    @Override
    public void deleteAll() {
        configRepository.deleteAll();
    }
}
