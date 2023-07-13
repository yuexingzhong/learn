package com.day.algoritm;

import cn.hippo4j.core.enable.EnableDynamicThreadPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2023/6/15 10:30
 * Version：1.0.0
 */
@SpringBootApplication
@EnableDynamicThreadPool
public class DayUpMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(DayUpMainApplication.class, args);
        System.out.println("====== day day up stydy on start  =======");
    }
}
