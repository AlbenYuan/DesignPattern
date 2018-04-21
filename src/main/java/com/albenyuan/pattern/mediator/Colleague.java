package com.albenyuan.pattern.mediator;

/**
 * @Author Alben Yuan
 * @Date 2018-04-21 11:48
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }


    public abstract void action1();

    public abstract void action2();
}
