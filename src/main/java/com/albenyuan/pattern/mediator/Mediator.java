package com.albenyuan.pattern.mediator;

/**
 * @Author Alben Yuan
 * @Date 2018-04-21 11:46
 */
public abstract class Mediator {

    protected Colleague colleague;

    public Colleague getColleague() {
        return colleague;
    }

    public void setColleague(Colleague colleague) {
        this.colleague = colleague;
    }

    public abstract void action();

    public abstract void operation();
}
