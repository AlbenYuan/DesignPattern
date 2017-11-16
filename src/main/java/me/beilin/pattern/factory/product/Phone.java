package me.beilin.pattern.factory.product;

/**
 * @Author albenyuan
 * @Date 2017-11-16 23:10
 */

public interface Phone {

    enum TYPE {
        MOBILE_PHONE, CELL_PHONE
    }

    void initialize();

    double sell();

    void using();

    void scrap();

}
