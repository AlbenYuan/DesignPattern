package me.beilin.pattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author albenyuan
 * @Date 2017-11-25 21:39
 */

public class AdapterObject implements Target {

    private static Logger logger = LoggerFactory.getLogger(AdapterObject.class);

    private Adaptee adaptee;

    public AdapterObject(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void create() {
        logger.info("create AdapterObject");
        adaptee.create();

    }

    public void destroy() {
        logger.info("destroy AdapterObject");
    }
}
