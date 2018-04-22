package com.albenyuan.pattern.flyweight;

/**
 * @Author Alben Yuan
 * @Date 2018-04-22 15:17
 */
public class ConcreteFlyweight implements Flyweight {

    private String state;

    public ConcreteFlyweight(String state) {
        this.state = state;
    }

    @Override
    public void operation(String state) {

    }
}
