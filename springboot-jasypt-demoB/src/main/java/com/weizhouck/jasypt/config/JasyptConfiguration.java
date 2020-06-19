package com.weizhouck.jasypt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 飞翔的胖哥
 * @version 1.0.0
 * @description 自定义Jasypt策略
 * @since 2020/6/20 0020 1:19
 **/
@Configuration
public class JasyptConfiguration {

    @Bean("jasyptStringEncryptor")
    public MineEncryptor mineEncryptor(){
        return new MineEncryptor();
    }

    @Bean("encryptablePropertyDetector")
    public MinePropertyDetector minePropertyDetector(){
        return new MinePropertyDetector();
    }
}
