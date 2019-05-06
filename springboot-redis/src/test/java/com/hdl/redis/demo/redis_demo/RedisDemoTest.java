package com.hdl.redis.demo.redis_demo;

import com.hdl.redis.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class RedisDemoTest {

    @Autowired
    RedisDemo redisDemo;

    @Test
    public void setValueTest(){
        redisDemo.setValue("name","ffy");
    }

    @Test
    public void getValueTest(){
        System.out.println(redisDemo.getValue("name"));
    }
}
