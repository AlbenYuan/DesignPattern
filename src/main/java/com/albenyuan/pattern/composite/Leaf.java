package com.albenyuan.pattern.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 00:10
 */
public class Leaf implements Component {
    private static final Logger logger = LoggerFactory.getLogger(Leaf.class);

    @Override
    public Component getComponent() {
        logger.info("Leaf.getComponent()");
        return null;
    }

    @Override
    public void operate() {
        logger.info("Leaf.operate()");
    }
}
