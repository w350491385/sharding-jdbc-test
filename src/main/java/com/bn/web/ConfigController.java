package com.bn.web;


import com.bn.entity.Config;
import com.bn.entity.User;
import com.bn.service.ConfigService;
import com.bn.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConfigController {

    Logger logger= LoggerFactory.getLogger(ConfigController.class);

    @Autowired
    private ConfigService configService;

    @GetMapping("/configs")
    public Object list() {
        List<Config> list= configService.list();
        return list;
    }

    @GetMapping("/config/add")
    public Object add() {
        for(int i=1;i<101;i++) {
            Config config = new Config();
            config.setName("forezp"+(i));
           long resutl=   configService.addConfig(config);
        }
        return "ok";
    }

    @GetMapping("/config/delete")
    public Object delete() {
        configService.deleteAll();
        return "ok";
    }
}
