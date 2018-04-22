package com.albenyuan.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author Alben Yuan
 * @Date 2018-04-22 15:18
 */
public interface FlyweightFactory {

    Flyweight getFlyweight(String state);
}
