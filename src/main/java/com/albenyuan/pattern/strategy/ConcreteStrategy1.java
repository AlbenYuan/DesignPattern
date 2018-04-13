package com.albenyuan.pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-13 20:00
 */
public class ConcreteStrategy1 implements Strategy {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void strategyInterface() {
        logger.info("ConcreteStrategy1.strategyInterface()");
    }
}
