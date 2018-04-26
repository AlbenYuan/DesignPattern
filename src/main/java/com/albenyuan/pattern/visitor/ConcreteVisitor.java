package com.albenyuan.pattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-26 14:30
 */
public class ConcreteVisitor implements Visitor {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void visit(Element element) {
        logger.info("ConcreteVisitor.visit():{}", element);
    }
}
