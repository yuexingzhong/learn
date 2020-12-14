package eurekamovie.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class EurekaMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMovieApplication.class, args);
        log.info("===========================================================================");
        log.info("===================eureka movie application start success==================");
        log.info("===========================================================================");
    }

}
