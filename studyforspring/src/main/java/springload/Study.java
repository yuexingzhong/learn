package springload;

import lombok.Data;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2021/8/5 14:01
 * Version：1.0.0
 */
@Data
public class Study {
    private String name;
    private String age;

    public void clean(){
        System.out.println("123");
    }
}
