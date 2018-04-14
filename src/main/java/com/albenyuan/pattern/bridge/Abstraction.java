package com.albenyuan.pattern.bridge;

/**
 * @Author Alben Yuan
 * @Date 2018-04-14 20:28
 */
public abstract class Abstraction {
    private Implementor implementor;

    public void operation() {
        implementor.operation();
    }
}
