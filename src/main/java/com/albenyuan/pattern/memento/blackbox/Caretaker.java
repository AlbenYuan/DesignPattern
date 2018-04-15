package com.albenyuan.pattern.memento.blackbox;

/**
 * @Author Alben Yuan
 * @Date 2018-04-15 17:18
 */
public class Caretaker {

    private MementoWare mementoWare;

    /**
     * 备忘录的取值方法
     */
    public MementoWare retrieveMemento() {
        return this.mementoWare;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(MementoWare mementoWare) {
        this.mementoWare = mementoWare;
    }
}
