package com.albenyuan.pattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 16:33
 */

public class ConcreteComponent implements Component {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteComponent.class);


    @Override
    public void method() {
        logger.info("ConcreteComponent.method()");
    }
}
