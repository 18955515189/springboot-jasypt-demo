package com.weizhouck.jasypt.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 飞翔的胖哥
 * @version 1.0.0
 * @description 配置文件工具类
 * @since 2020/6/20 0020 1:01
 **/
@Component
@Data
@ConfigurationProperties(prefix = "mine.jasypt")
public class MineProperties {
    private String username;
    private String password;
}
