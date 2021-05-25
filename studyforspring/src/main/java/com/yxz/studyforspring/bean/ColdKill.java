package com.yxz.studyforspring.bean;

/**
 * Created by YUEXINGZHONG on 2020/8/19 15:56
 */
public class ColdKill implements Kill {

    private DaliyTask daliyTask;

    public ColdKill(DaliyTask task) {
        this.daliyTask = task;
    }

    @Override
    public void play() {
        daliyTask.action();
    }
}
