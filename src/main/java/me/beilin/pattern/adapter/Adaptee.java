package me.beilin.pattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author albenyuan
 * @Date 2017-11-25 21:32
 */

public class Adaptee {

    private static Logger logger = LoggerFactory.getLogger(Adaptee.class);

    public void create() {
        logger.info("create Adaptee");
    }

}
