package com.albenyuan.pattern.observer;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 00:39
 */
public interface Observer {

    /**
     * 观察者收到通知后的操作
     */
    void update(Integer state);

}
