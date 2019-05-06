package com.hdl.redis.demo.redis_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisDemo {

    @Autowired
    StringRedisTemplate redisTemplate;

    public void setValue(String k,String v){
        redisTemplate.boundValueOps(k).set(v);
    }

    public String getValue(String k){
        return redisTemplate.boundValueOps(k).get();
    }
}
