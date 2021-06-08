package com.example.redisson.controller;

import com.example.redisson.config.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2021/6/8 10:02
 * Version：1.0.0
 */
@RestController
@RequestMapping("/api/redisson")
public class UserController {

    @Autowired
    private RedisUtil redisUtil;


    @RequestMapping("keys")
    public String getKeys(@RequestParam("key") String key, @RequestParam("value") String value) {
        redisUtil.set(key, value);
        return (String)redisUtil.get(key);
    }
}
