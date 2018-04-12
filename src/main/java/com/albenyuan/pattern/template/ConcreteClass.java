package com.albenyuan.pattern.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-12 09:21
 */
public class ConcreteClass extends AbstractClass {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteClass.class);

    @Override
    protected void init() {
        logger.info("ConcreteClass.init()");
    }

    @Override
    protected void doing() {
        logger.info("ConcreteClass.doing()");
    }

    @Override
    protected void destroy() {
        logger.info("ConcreteClass.destroy()");
    }
}
