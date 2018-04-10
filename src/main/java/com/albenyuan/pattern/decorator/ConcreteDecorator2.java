package com.albenyuan.pattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-10 16:48
 */

public class ConcreteDecorator2 extends Decorator {

    private static final Logger logger = LoggerFactory.getLogger(ConcreteDecorator2.class);

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void method() {
        super.method();
        this.method2();
    }

    public void method2() {
        logger.info("ConcreteDecorator2.method2()");
    }


}
