package com.albenyuan.pattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 16:45
 */

public class Decorator implements Component {

    private static final Logger logger = LoggerFactory.getLogger(Decorator.class);

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        logger.info("Decorator.method()");
        this.component.method();
    }
}
