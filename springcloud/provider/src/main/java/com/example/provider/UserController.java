package com.example.provider;

import com.example.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YUEXINGZHONG  2020/10/14 17:08
 * @version V1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private UserRespository userRespository;


    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userRespository.findOne(id);
    }
}
