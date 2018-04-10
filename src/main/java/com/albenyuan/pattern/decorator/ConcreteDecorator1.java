package com.albenyuan.pattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 16:48
 */

public class ConcreteDecorator1 extends Decorator {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteDecorator1.class);

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void method() {
        super.method();
        this.method1();
    }

    public void method1() {
        logger.info("ConcreteDecorator1.method1()");
    }


}
