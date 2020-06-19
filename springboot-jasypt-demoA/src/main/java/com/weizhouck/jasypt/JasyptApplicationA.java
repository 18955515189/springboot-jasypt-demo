package com.weizhouck.jasypt;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 飞翔的胖哥
 * @version 1.0.0
 * @description 启动引导类 重点：添 加 @EnableEncryptableProperties
 * @since 2020/6/20 0020 0:56
 **/
@SpringBootApplication
@EnableEncryptableProperties
public class JasyptApplicationA {
    public static void main(String[] args){
        SpringApplication.run(JasyptApplicationA.class,args);
    }
}
