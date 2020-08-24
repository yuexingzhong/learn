package com.yxz.csdn.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author YUEXINGZHONG
 * @Desc
 * @Since 2020-08-22 09:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AjaxRequest {
    /*
    请求头
     */
    private String header;
    /*
    请求方式
     */
    private String ajaxMethod;
    /*
    请求cookie
     */
    private String cookie;
    /*
    耗时
     */
    private long time;
}
