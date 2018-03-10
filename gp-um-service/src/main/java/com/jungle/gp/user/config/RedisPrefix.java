/**
 * Project Name:gp-um-service
 * File Name:RedisPrefix.java
 * Package Name:com.jungle.gp.user.config
 * Date:2018年3月3日下午4:10:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.user.config;

import org.springframework.data.redis.cache.RedisCachePrefix;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Description:   <br/>
 * Date:     2018年3月3日 下午4:10:43 <br/>
 * @author   thinkpad
 * @version
 * @see
 */
public class RedisPrefix implements RedisCachePrefix {
    private final RedisSerializer<String> serializer;
    private final String delimiter;

    public RedisPrefix() {
        this(":");
    }

    public RedisPrefix(String delimiter) {
        this.serializer = new StringRedisSerializer();
        this.delimiter = delimiter;
    }

    @Override
    public byte[] prefix(String cacheName) {
        return this.serializer.serialize(this.delimiter != null ? this.delimiter.concat(":").concat(cacheName).concat(":") : cacheName.concat(":"));
    }
}

