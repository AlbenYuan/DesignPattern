package me.beilin.pattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author albenyuan
 * @Date 2017-11-25 21:34
 */

public class AdapterClass extends Adaptee implements Target {

    private static Logger logger = LoggerFactory.getLogger(AdapterClass.class);

    public void destroy() {
        logger.info("destroy AdapterClass");
    }
}
