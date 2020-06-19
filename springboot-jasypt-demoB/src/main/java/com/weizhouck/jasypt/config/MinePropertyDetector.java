package com.weizhouck.jasypt.config;

import com.ulisesbocchio.jasyptspringboot.EncryptablePropertyDetector;
import org.springframework.util.Assert;

/**
 * @author 飞翔的胖哥
 * @version 1.0.0
 * @description TODO
 * @since 2020/6/20 0020 1:27
 **/
public class MinePropertyDetector implements EncryptablePropertyDetector {
    private String prefix = "jasypt(";
    private String suffix = ")";

    public MinePropertyDetector() {
    }

    public MinePropertyDetector(String prefix, String suffix) {
        Assert.notNull(prefix, "Prefix can't be null");
        Assert.notNull(suffix, "Suffix can't be null");
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public boolean isEncrypted(String property) {
        if (property == null) {
            return false;
        } else {
            String trimmedValue = property.trim();
            return trimmedValue.startsWith(this.prefix) && trimmedValue.endsWith(this.suffix);
        }
    }

    public String unwrapEncryptedValue(String property) {
        return property.substring(this.prefix.length(), property.length() - this.suffix.length());
    }
}
