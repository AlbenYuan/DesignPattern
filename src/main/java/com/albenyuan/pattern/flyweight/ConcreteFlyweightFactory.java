package com.albenyuan.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author Alben Yuan
 * @Date 2018-04-22 15:22
 */
public class ConcreteFlyweightFactory implements FlyweightFactory {

    private Map<String, Flyweight> files = new ConcurrentHashMap<>();

    public Flyweight getFlyweight(String state) {
        Flyweight flyweight = files.get(state);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(state);
            files.put(state, flyweight);
        }
        return flyweight;
    }
}
