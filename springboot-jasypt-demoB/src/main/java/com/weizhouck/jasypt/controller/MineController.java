package com.weizhouck.jasypt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weizhouck.jasypt.config.MineProperties;

/**
 * @author 飞翔的胖哥
 * @version 1.0.0
 * @description MineController
 * @since 2020/6/20 0020 1:03
 **/
@RestController
public class MineController {

    @Autowired
    private MineProperties mineProperties;

    @GetMapping("get")
    public String get(){
        return mineProperties.toString();
    }
}
