package com.example.designpattern.descign_pattern.observer_pattern.partOne;


import java.util.ArrayList;

/**
 * 主题者. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/24  11:05
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void noticeObservers();
}
