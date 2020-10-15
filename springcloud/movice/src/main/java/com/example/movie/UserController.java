package com.example.movie;

import com.example.movie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author YUEXINGZHONG  2020/10/14 17:08
 * @version V1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;


    @Value("${user.userServiceUrl}")

    private String url;


    @GetMapping("user/{id}")
    public User findById(@PathVariable("id") Long id) {
        return restTemplate.postForObject(url + id, 123, User.class);
    }

}
