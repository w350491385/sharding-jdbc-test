package com.bn.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bn.entity.Config;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConfigRepository  extends BaseMapper<Config> {

    Integer addConfig(Config config);

    List<Config> list();

    void deleteAll();
}
