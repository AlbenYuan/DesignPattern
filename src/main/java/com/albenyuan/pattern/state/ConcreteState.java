package com.albenyuan.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 15:49
 */
public class ConcreteState implements State {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteState.class);

    @Override
    public void handle() {
        logger.info("ConcreteState.handle()");
    }


}
