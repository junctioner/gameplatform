/**
 * Project Name:gp-um-web
 * File Name:HttpSessionConfig.java
 * Package Name:com.jungle.gp.config
 * Date:2018年3月3日下午5:35:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package com.jungle.gp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;

/**
 * Description:   <br/>
 * Date:     2018年3月3日 下午5:35:12 <br/>
 * @author   thinkpad
 * @version
 * @see
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 100, redisNamespace = "RS")  
public class HttpSessionConfig {  
  
    @Bean  
    public HttpSessionStrategy httpSessionStrategy() {  
        return new HeaderHttpSessionStrategy();  
    }  
} 

