package com.albenyuan.pattern.factory.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben
 * @Date 17/3/13
 * @Version v0.0.1
 */
public class CellPhone implements Phone {


    private static Logger logger = LoggerFactory.getLogger(CellPhone.class);

    public void initialize() {
        logger.info("initialize CellPhone!");
    }

    public double sell() {
        logger.info("sell CellPhone!");
        return 1000.0;
    }

    public void using() {
        logger.info("using CellPhone!");
    }

    public void scrap() {
        logger.info("scrap CellPhone!");
    }
}
