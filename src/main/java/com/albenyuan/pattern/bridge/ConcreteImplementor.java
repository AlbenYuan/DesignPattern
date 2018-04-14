package com.albenyuan.pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-14 20:32
 */
public class ConcreteImplementor extends Implementor {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void operation() {
        logger.info("ConcreteImplementor.operation()");
        super.operation();
    }
}
