package com.yxz.csdn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CsdnApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsdnApplication.class, args);
        log.info("===========================================");
        log.info("==== loyalty application start success ====");
        log.info("===========================================");
    }

}
