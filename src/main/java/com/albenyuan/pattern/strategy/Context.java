package com.albenyuan.pattern.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author Alben Yuan
 * @Date 2018-04-13 20:00
 */
public class Context {

    private Strategy strategy = new ConcreteStrategy1();

    private String value;

    /**
     * 业务内容
     */
    public void action() {
        strategy.strategyInterface();
    }

    /**
     * 对使用策略的依赖值进行设置
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
        if (StringUtils.isNotEmpty(value)) {
            strategy = new ConcreteStrategy2();
        }
        strategy = new ConcreteStrategy1();
    }
}
