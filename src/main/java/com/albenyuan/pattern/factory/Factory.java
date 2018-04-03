package com.albenyuan.pattern.factory;

import com.albenyuan.pattern.factory.product.CellPhone;
import com.albenyuan.pattern.factory.product.MobilePhone;
import com.albenyuan.pattern.factory.product.Phone;

/**
 * @Author albenyuan
 * @Date 2017-11-16 23:08
 */

public class Factory {

    public static Phone create(Phone.TYPE type) {
        Phone phone = null;
        switch (type) {
            case CELL_PHONE:
                phone = new MobilePhone();
                break;
            case MOBILE_PHONE:
                phone = new CellPhone();
                break;
            default:
                new RuntimeException("unknown phone type");
        }
        return phone;
    }
}
