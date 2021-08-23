package com.example.haskmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.plugin.dom.core.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@SpringBootApplication
public class HaskmapApplication {

    public static void main(String[] args) {
        Map a = new HashMap();
        a.put(null, 123);
        Map b = new Hashtable();
        b.put(123, 123);

        b.put(null, 123);
    }

}
