package springload;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2021/8/4 10:08
 * Version：1.0.0
 */
@SpringBootApplication
public class SpringLoadStudy {


    public static void main(String[] args) {

        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:application.xml");
        Study study =(Study) ac.getBean("study");
        System.out.println(study.getAge());
    }
}
