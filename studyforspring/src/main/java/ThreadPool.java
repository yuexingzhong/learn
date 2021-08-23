import java.util.concurrent.*;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2021/8/18 15:33
 * Version：1.0.0
 */
public class ThreadPool {

    public static void main(String[] args) {

        getName();
        getName2();
        getName3();
    }

    public static String getName() {
        try {
            Thread.sleep(1000);

        } catch (Exception e) {

        }
        return "zhangsan";
    }

    public static String getName2() {
        try {
            Thread.sleep(3000);

        } catch (Exception e) {

        }
        return "zhangsan";
    }

    public static String getName3() {
        try {
            Thread.sleep(2000);

        } catch (Exception e) {

        }
        return "zhangsan";
    }
}
