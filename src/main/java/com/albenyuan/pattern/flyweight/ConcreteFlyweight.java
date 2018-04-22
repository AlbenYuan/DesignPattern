package com.albenyuan.pattern.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-22 15:17
 */
public class ConcreteFlyweight implements Flyweight {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private String innerState;

    public ConcreteFlyweight(String state) {
        this.innerState = state;
    }

    @Override
    public void operation(String state) {
        logger.info("inner state:{}", this.innerState);
        logger.info("outer state:{}", state);
    }
}
