package com.albenyuan.pattern.state;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-11 15:50
 */
public class Context {

    private static final Logger logger = LoggerFactory.getLogger(Context.class);

    private State state;

    private String value;


    public void setValue(String value) {
        this.value = value;
        if (StringUtils.isNotEmpty(this.value)) {
            this.setState(new ConcreteState());
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle() {
        logger.info("Context.handle()");
        if (null != state) {
            state.handle();
        } else {
            logger.info("do nothing");
        }
    }


}
