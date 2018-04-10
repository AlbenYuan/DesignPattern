package com.albenyuan.pattern.composite;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 00:10
 */
public interface Component {

    /**
     * 返回当前实例
     *
     * @return
     */
    Component getComponent();

    /**
     * 具体业务操作
     */
    void operate();
}
