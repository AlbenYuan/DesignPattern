package me.beilin.pattern.factory;

import me.beilin.pattern.factory.product.CellPhone;
import me.beilin.pattern.factory.product.MobilePhone;
import me.beilin.pattern.factory.product.Phone;

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
