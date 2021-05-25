package com.example.designpattern.descign_pattern.proxy_pattern.dynamic_proxy.cglib;

import com.example.designpattern.descign_pattern.proxy_pattern.dynamic_proxy.DoSomeService;
import com.example.designpattern.descign_pattern.proxy_pattern.dynamic_proxy.DoSomeThing;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by YUEXINGZHONG on 2020/8/18 15:24
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 代理动态 监听开始");
        Object invoke = method.invoke(target, objects);
        System.out.println("Cglib 代理动态 监听结束");
        return invoke;
    }

    private Object getCglibProxy(Object interceptor) {
        this.target = interceptor;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        DoSomeThing cglibProxy = (DoSomeThing) proxy.getCglibProxy(new DoSomeThing());
        cglibProxy.please();
    }


}
