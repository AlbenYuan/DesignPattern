package com.albenyuan.pattern.responsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-12 10:40
 */
public class ConcreteHandler2 extends Handler {


    private static Logger logger = LoggerFactory.getLogger(ConcreteHandler2.class);

    @Override
    public void action() {
        logger.info("ConcreteHandler2.action()");
        super.action();
    }

    @Override
    protected Handler getNextHandler() {
        logger.info("ConcreteHandler2.getNextHandler()");
        return super.getNextHandler();
    }
}
