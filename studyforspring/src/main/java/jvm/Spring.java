package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2021/7/27 16:42
 * Version：1.0.0
 */
public class Spring {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while (true) {
            list.add(String.valueOf(System.currentTimeMillis()));
        }
    }
}
