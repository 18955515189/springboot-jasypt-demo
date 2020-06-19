package com.weizhouck.jasypt.config;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;

/**
 * @author 飞翔的胖哥
 * @version 1.0.0
 * @description 自定义加解密规则
 * @since 2020/6/20 0020 1:21
 **/
@Slf4j
public class MineEncryptor implements StringEncryptor {
    @Override
    public String encrypt(String message) {
        log.error("MineEncryptor encrypt :"+message);
        return message;
    }

    @Override
    public String decrypt(String message) {
        log.error("MineEncryptor decrypt :"+message);
        return message;
    }
}
