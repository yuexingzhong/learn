package com.example.redisson.controller;

import com.example.redisson.config.RedisUtil;
import com.example.redisson.lock.RedissonLock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@Slf4j
public class UserController {

    @Autowired
    private RedisUtil redisUtil;

    public static volatile Integer TOTAL = 10;

    @Autowired
    RedissonLock redissonLock;



    @RequestMapping("keys")
    public String getKeys(@RequestParam("key") String key, @RequestParam("value") String value) {
        redisUtil.set(key, value);
        return (String) redisUtil.get(key);
    }




    @GetMapping("lock-decrease-stock")
    public String lockDecreaseStock() throws InterruptedException {
        redissonLock.lock("lock", 10);
        if (TOTAL > 0) {
            TOTAL--;
        }
        Thread.sleep(50);
        log.info("======减完库存后,当前库存===" + TOTAL);
        //如果该线程还持有该锁，那么释放该锁。如果该线程不持有该锁，说明该线程的锁已到过期时间，自动释放锁
        if (redissonLock.isHeldByCurrentThread("lock")) {
            redissonLock.unlock("lock");
        }
        return "=================================";
    }
}
