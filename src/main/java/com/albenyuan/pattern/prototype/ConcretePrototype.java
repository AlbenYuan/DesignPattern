package com.albenyuan.pattern.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author albenyuan
 * @Date 2017-11-14 14:16
 */

public class ConcretePrototype implements Prototype {

    private static Logger logger = LoggerFactory.getLogger(ConcretePrototype.class);

    public Prototype clone() {
        logger.info("copy Prototype");
        Prototype prototype = new ConcretePrototype();
        return prototype;
    }

}
