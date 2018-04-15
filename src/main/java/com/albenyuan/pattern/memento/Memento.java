package com.albenyuan.pattern.memento;

/**
 * @Author Alben Yuan
 * @Date 2018-04-15 17:05
 */
public class Memento {

    private int state;

    public Memento() {
        super();
    }

    public Memento(int state) {
        this.state = state;
        System.out.println("备忘录 当前保存 状态：" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


}
