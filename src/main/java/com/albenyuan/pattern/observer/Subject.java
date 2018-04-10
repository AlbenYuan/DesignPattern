package com.albenyuan.pattern.observer;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 00:39
 */
public interface Subject {

    /**
     * 添加观察者
     *
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 去除观察者
     *
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知全部观察者
     */
    void notifyObserver();

}
