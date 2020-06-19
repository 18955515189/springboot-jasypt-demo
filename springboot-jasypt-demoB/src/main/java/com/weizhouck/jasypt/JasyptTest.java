package com.weizhouck.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 * @author 飞翔的胖哥
 * @version 1.0.0
 * @description 获取测试代码
 * @since 2020/6/20 0020 0:58
 **/
public class JasyptTest {
    public static void main(String[] args){
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("123456");
        System.out.println(" encryptRoot ="+encryptor.encrypt("root"));
        System.out.println(" encryptencryptRootPwdRoot ="+encryptor.encrypt("root123"));
    }
}
