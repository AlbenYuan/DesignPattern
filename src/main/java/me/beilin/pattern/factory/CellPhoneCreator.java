package me.beilin.pattern.factory;

import me.beilin.pattern.factory.product.CellPhone;
import me.beilin.pattern.factory.product.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author albenyuan
 * @Date 2017-11-16 23:27
 */

public class CellPhoneCreator implements Creator {

    private static Logger logger = LoggerFactory.getLogger(CellPhoneCreator.class);

    public Phone create() {
        logger.info("CellPhoneCreator create CellPhone.");
        return new CellPhone();
    }
}
