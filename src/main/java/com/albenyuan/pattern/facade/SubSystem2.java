package com.albenyuan.pattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-14 21:01
 */
public class SubSystem2 {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void operation() {
        logger.info("SubSystem2.operation()");
    }

}
