package com.example.designpattern.descign_pattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


public class DescignPatternApplicationTests {

    @Test
    public void contextLoads() {
        List<String> list = new ArrayList<>();
        for (String str : list) {
            System.out.println("11");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("22");
        }
        list = new ArrayList<>();
        for (String str : list) {
            System.out.println("11");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("22");
        }
    }

}
