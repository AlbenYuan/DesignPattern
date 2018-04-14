package com.albenyuan.pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-14 20:30
 */
public class RefinedAbstraction extends Abstraction {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void operation() {
        // 具体的业务内容
        logger.info("RefinedAbstraction.operation()");
        super.operation();
    }
}
