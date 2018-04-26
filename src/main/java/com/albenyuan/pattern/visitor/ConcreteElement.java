package com.albenyuan.pattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-26 14:31
 */
public class ConcreteElement implements Element {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void accept(Visitor visitor) {
        logger.info("ConcreteElement.accept({})", visitor);
        visitor.visit(this);
    }

    public void operation() {

        logger.info("ConcreteElement.operation()");
    }
}
