package com.yxz.csdn.controller;

import com.yxz.csdn.config.DynamicLog;
import com.yxz.csdn.model.vo.AjaxRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.jms.JmsHealthIndicator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @Author YUEXINGZHONG
 * @Desc
 * @Since 2020-08-22 08:32
 */
@Controller
@RequestMapping("/")
public class UrlController {


    @GetMapping("index")
    public String getInfo(ModelMap modelMap) {

        modelMap.put("msg", "CSDN面试题");
        return "index";
    }

    @GetMapping("info")
    @ResponseBody
    @DynamicLog
    public AjaxRequest getInfo(HttpServletRequest request) {
        long begin = System.currentTimeMillis();
        AjaxRequest result = new AjaxRequest();
        result.setAjaxMethod(request.getMethod());
        result.setHeader(request.getHeader("user-agent"));
        result.setCookie(Objects.toString(request.getCookies(), ""));
        long end = System.currentTimeMillis();
        result.setTime(end - begin);
        return result;

    }

    @GetMapping("/jvm")
    @ResponseBody
    @DynamicLog
    public void getJvm() {

    }

}
