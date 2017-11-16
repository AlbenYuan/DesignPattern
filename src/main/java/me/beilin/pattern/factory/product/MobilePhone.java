package me.beilin.pattern.factory.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben
 * @Date 17/3/13
 * @Version v0.0.1
 */
public class MobilePhone implements Phone {

    private static Logger logger = LoggerFactory.getLogger(MobilePhone.class);

    public void initialize() {
        logger.info("initialize MobilePhone!");
    }

    public double sell() {
        logger.info("sell MobilePhone!");
        return 1000.0;
    }

    public void using() {
        logger.info("using MobilePhone!");
    }

    public void scrap() {
        logger.info("scrap MobilePhone!");
    }
}
