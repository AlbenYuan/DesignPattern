package com.albenyuan.pattern.factory;

import com.albenyuan.pattern.factory.product.MobilePhone;
import com.albenyuan.pattern.factory.product.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author albenyuan
 * @Date 2017-11-16 23:26
 */

public class MobilePhoneCreator implements Creator {

    private static Logger logger = LoggerFactory.getLogger(MobilePhoneCreator.class);

    public Phone create() {
        logger.info("MobilePhoneCreator create MobilePhone");
        return new MobilePhone();
    }
}
