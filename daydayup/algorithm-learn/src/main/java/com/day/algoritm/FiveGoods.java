package com.day.algoritm;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/23 18:23
 * Version：1.0.0
 */
public class FiveGoods {

    public static void main(String[] args) {

        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;
        print(2, new int[]{a1, a2, a3, a4, a5});

    }

    static void print(int m, int[] as) {
        for (int i = 0; i < as.length; i++) {
            if (as[i] * 2 > m) {
                System.out.println(as[i] * 2);
            }
            for (int j = 0; j < as.length; j++) {
                if (j != i && (as[i] + as[j] > m)) {
                    System.out.println(as[i] + as[j]);
                }

            }

        }


    }
}
