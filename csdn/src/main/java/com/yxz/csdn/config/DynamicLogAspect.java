package com.yxz.csdn.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @Author YUEXINGZHONG
 * @Desc
 * @Since 2020-08-22 08:39
 */
@Aspect
@Component
@Slf4j
public class DynamicLogAspect {


    @Pointcut("@annotation(com.yxz.csdn.config.DynamicLog)")
    public void logPoint() {
    }

    @Around("logPoint()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        // 执行方法
        result = point.proceed();
        // 保存请求日志
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        log.info("请求路径:" + request.getRequestURL());
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        log.info("请求方法:" + method.getName());
        // 获取方法上LogFilter注解
        DynamicLog logFilter = method.getAnnotation(DynamicLog.class);
        String value = logFilter.value();
        log.info("模块描述:" + value);
        Object[] args = point.getArgs();
        log.info("请求参数:" + Objects.toString(args,""));
        return result;
    }
}