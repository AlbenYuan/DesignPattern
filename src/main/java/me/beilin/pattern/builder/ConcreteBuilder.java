package me.beilin.pattern.builder;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author albenyuan
 * @Date 2017-11-16 23:43
 */
public class ConcreteBuilder implements Builder {

    private static Logger logger = LoggerFactory.getLogger(ConcreteBuilder.class);


    private Phone phone = new Phone();

    public void produceComponent() {
        logger.info("生产手机零部件");
        phone.setComponent("零件");
    }

    public void assemble() {
        logger.info("组装手机零部件");
        if (StringUtils.isEmpty(phone.getComponent())) {
            logger.warn("零部件未获取");
        }
        phone.setAssembled(true);
    }

    public void installOS() {
        if (!Boolean.TRUE.equals(phone.getAssembled())) {
            logger.warn("零件未组装");
        }
        logger.info("安装手机系统");
    }

    public Phone receive() {
        return phone;
    }
}
