package com.albenyuan.pattern.memento.wihtebox;

/**
 * @Author Alben Yuan
 * @Date 2018-04-15 17:05
 */
public class Caretaker {

    private Memento memento;


    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento() {
        return this.memento;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
