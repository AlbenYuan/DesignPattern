package com.albenyuan.pattern.template;

/**
 * @Author Alben Yuan
 * @Date 2018-04-12 09:18
 */
public abstract class AbstractClass {

    protected abstract void init();

    protected abstract void doing();

    protected abstract void destroy();

    public void action() {
        this.init();
        this.doing();
        this.destroy();
    }


}
